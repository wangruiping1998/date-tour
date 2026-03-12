package cn.wangruiping.tour.common.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.nio.file.Path;

/**
 * 系统属性
 * @author wrp
 * @since 2025年08月25日 12:40
 **/
@Data
@Component
@ConfigurationProperties(prefix = "tour-system")
public class SystemProperties {
    private Path basePath;
}
