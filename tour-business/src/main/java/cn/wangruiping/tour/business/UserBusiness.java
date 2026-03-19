package cn.wangruiping.tour.business;

import cn.dev33.satoken.stp.StpUtil;
import cn.wangruiping.tour.business.param.UserRegisterParam;
import cn.wangruiping.tour.business.param.UsernamePasswordLoginParam;
import cn.wangruiping.tour.db.entity.UserEntity;
import cn.wangruiping.tour.db.service.UserService;
import cn.wangruiping.tour.user.UserException;
import cn.wangruiping.tour.wechat.WechatLoginInfo;
import cn.wangruiping.tour.wechat.WechatService;
import cn.wangruiping.tour.wechat.WechatUserInfo;
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
    private final WechatService wechatService;

    public UserEntity register(UserRegisterParam param) {
        UserEntity user = new UserEntity();
        BeanUtils.copyProperties(param, user);
        userService.save(user);
        return user;
    }

    public void wechatLogin(WechatLoginInfo loginInfo) {
        WechatUserInfo wechatUserInfo = wechatService.login(loginInfo);
        UserEntity user = userService.getByPhone(wechatUserInfo.getPhone());
        if(user == null) {
            UserRegisterParam userRegisterParam = new UserRegisterParam();
            userRegisterParam.setUsername(wechatUserInfo.getPhone());
            userRegisterParam.setPhone(wechatUserInfo.getPhone());
            user = register(userRegisterParam);
        }

        StpUtil.login(user.getId());
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
