package cn.wangruiping.tour.business.param;

import cn.wangruiping.tour.common.dict.Gender;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.time.LocalDate;

/**
 *
 * @author wrp
 * @since 2026年03月12日 10:50
 **/
@Data
public class UserRegisterParam {
    @NotEmpty
    private String username;
    @NotEmpty
    private String password;
    private String realName;
    private LocalDate birthday;
    private Gender gender;
    private String url;
    private String phone;
    private String email;
    private String qq;
    private String profile;
    @NotEmpty
    private String pac;
}
