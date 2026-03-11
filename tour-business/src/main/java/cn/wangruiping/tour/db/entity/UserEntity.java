package cn.wangruiping.tour.db.entity;

import cn.wangruiping.tour.common.dict.Gender;
import cn.wangruiping.tour.common.domain.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

/**
 * 用户
 * @author wrp
 * @since 2026年03月11日 14:02
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@TableName(value = "public.user", autoResultMap = true)
public class UserEntity extends BaseEntity {
    private String username;
    private String password;
    private String realName;
    private LocalDate birthday;
    private Gender gender;
    private String url;
    private String phone;
    private String email;
    private String qq;
    private String openid;
    private String profile;
    private String pac;
}
