package cn.wangruiping.tour.business.api;

import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import cn.wangruiping.tour.business.UserBusiness;
import cn.wangruiping.tour.business.param.UserRegisterParam;
import cn.wangruiping.tour.business.param.UsernamePasswordLoginParam;
import cn.wangruiping.tour.common.domain.Result;
import cn.wangruiping.tour.common.util.ResultUtils;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author wrp
 * @since 2026年03月12日 10:34
 **/
@Tag(name = "用户模块")
@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    private final UserBusiness userBusiness;

    @Operation(summary = "用户注册")
    @PostMapping("register")
    public Result<Void> register(@RequestBody @Validated UserRegisterParam param) {
        userBusiness.register(param);
        return ResultUtils.success();
    }

    @Operation(summary = "用户名密码登录")
    @PostMapping("login")
    public Result<Void> login(@RequestBody @Validated UsernamePasswordLoginParam param) {
        userBusiness.login(param);
        return ResultUtils.success();
    }

    @Operation(summary = "用户退出登录")
    @GetMapping("logout")
    public Result<Void> logout() {
        StpUtil.logout();
        return ResultUtils.success();
    }

    @GetMapping("tokenInfo")
    public Result<SaTokenInfo> tokenInfo() {
        return ResultUtils.success(StpUtil.getTokenInfo());
    }
}
