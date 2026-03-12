package cn.wangruiping.tour.business;

import cn.dev33.satoken.stp.StpUtil;
import cn.wangruiping.tour.business.param.UserRegisterParam;
import cn.wangruiping.tour.business.param.UsernamePasswordLoginParam;
import cn.wangruiping.tour.db.entity.UserEntity;
import cn.wangruiping.tour.db.service.UserService;
import cn.wangruiping.tour.user.UserException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

/**
 *
 * @author wrp
 * @since 2026年03月12日 10:44
 **/
@Component
@RequiredArgsConstructor
public class UserBusiness {

    private final UserService userService;

    public void register(UserRegisterParam param) {
        UserEntity user = new UserEntity();
        BeanUtils.copyProperties(param, user);
        userService.save(user);
    }

    public void login(UsernamePasswordLoginParam param) {
        UserEntity user = userService.getByUsername(param.getUsername());
        if(user == null) {
            throw new UserException("用户名不存在");
        }
        // TODO 密码加密
        if(!user.getPassword().equals(param.getPassword())) {
            throw new UserException("密码错误");
        }

        // TODO 验证验证码

        StpUtil.login(user.getId());
    }
}
