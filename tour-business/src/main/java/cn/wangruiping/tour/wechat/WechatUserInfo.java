package cn.wangruiping.tour.wechat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author wrp
 * @since 2026年03月19日 16:30
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WechatUserInfo {
    private String openid;
    private String phone;
}
