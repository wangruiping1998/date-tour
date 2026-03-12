package cn.wangruiping.tour.business.param;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

/**
 * 用户名密码登录参数
 * @author wrp
 * @since 2026年03月12日 10:42
 **/
@Data
public class UsernamePasswordLoginParam {
    @NotEmpty
    private String username;
    @NotEmpty
    private String password;
    @NotEmpty
    private String key;
    @NotEmpty
    @Schema(title = "验证码")
    private String code;
}
