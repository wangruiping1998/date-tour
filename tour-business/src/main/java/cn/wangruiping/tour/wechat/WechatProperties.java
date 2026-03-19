package cn.wangruiping.tour.wechat;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *
 * @author wrp
 * @since 2026年03月19日 16:27
 **/
@ConfigurationProperties(prefix = "wechat")
@Data
@Component
public class WechatProperties {
    private String appId;
    private String appSecret;
    private String url;
}
