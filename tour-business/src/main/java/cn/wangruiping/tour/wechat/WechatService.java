package cn.wangruiping.tour.wechat;

import cn.hutool.core.codec.Base64;
import cn.hutool.crypto.Mode;
import cn.hutool.crypto.Padding;
import cn.hutool.crypto.symmetric.AES;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * 微信服务
 * @author wrp
 * @since 2026年03月19日 16:26
 **/
@Slf4j
@Component
@AllArgsConstructor
public class WechatService {
    private final WechatProperties wechatProperties;
    private final RestTemplate restTemplate;

    public WechatUserInfo login(WechatLoginInfo loginUser) {
        String code = loginUser.getCode();
        String encryptedData = loginUser.getEncryptedData();
        String iv = loginUser.getIv();
        String url = String.format("%ssns/jscode2session?appid=%s&secret=%s&js_code=%s&grant_type=authorization_code",
                wechatProperties.getUrl(), wechatProperties.getAppId(), wechatProperties.getAppSecret(), code);
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            try {
                JSONObject body = JSONUtil.parseObj(responseEntity.getBody());
                if (body.getStr("errmsg") != null) {
                    throw new WeChatException(body.getStr("errmsg"));
                }
                byte[] sessionKeyDecode, ivDecode, dataDecode;
                sessionKeyDecode = Base64.decode(body.getStr("session_key"));
                String openid = body.getStr("openid");
                ivDecode = Base64.decode(iv);
                dataDecode = Base64.decode(encryptedData);
                AES aes = new AES(Mode.CBC, Padding.NoPadding, sessionKeyDecode, ivDecode);
                String s = new String(aes.decrypt(dataDecode));
                JSONObject object = JSONUtil.parseObj(s);
                String phone = object.getStr("purePhoneNumber");
                return new WechatUserInfo(openid, phone);
            } catch (Exception e) {
                log.error("微信登录异常", e);
                throw new WeChatException("微信登录异常，请稍后再试");
            }
        } else {
            throw new WeChatException("微信登录存在问题:" + responseEntity.getBody());
        }
    }
}
