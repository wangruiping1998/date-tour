package cn.wangruiping.tour.wechat;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

/**
 * 微信小程序登录信息
 * @author wrp
 * @since 2026年03月19日 16:25
 **/
@Data
public class WechatLoginInfo {
    @NotEmpty(message = "请使用微信小程序登录")
    private String code;
    @NotEmpty(message = "请使用微信小程序登录")
    private String encryptedData;
    @NotEmpty(message = "请使用微信小程序登录")
    private String iv;
}
