package cn.wangruiping.tour.business.api;

import cn.wangruiping.tour.business.UserSpotCheckinsBusiness;
import cn.wangruiping.tour.common.domain.Result;
import cn.wangruiping.tour.common.util.ResultUtils;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户景点打卡
 * @author wrp
 * @since 2026年03月12日 9:05
 **/
@Tag(name = "用户景点打卡模块")
@RestController
@RequestMapping("spot/checkins")
@RequiredArgsConstructor
public class UserSpotCheckinsController {

    private final UserSpotCheckinsBusiness userSpotCheckinsBusiness;

    @Operation(summary = "打卡景点")
    @PostMapping("{spotId}")
    public Result<Void> checkins(@PathVariable("spotId") Long spotId) {
        userSpotCheckinsBusiness.checkins(spotId);
        return ResultUtils.success();
    }
}
