package cn.wangruiping.tour.business.api;

import cn.wangruiping.tour.business.ScenicSpotBusiness;
import cn.wangruiping.tour.business.param.ScenicSpotPageParam;
import cn.wangruiping.tour.business.vo.ScenicSpotVO;
import cn.wangruiping.tour.common.domain.Result;
import cn.wangruiping.tour.common.util.ResultUtils;
import cn.wangruiping.tour.db.entity.ScenicSpotEntity;
import cn.wangruiping.tour.db.service.ScenicSpotService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * @author wrp
 * @since 2026年03月11日 14:26
 **/
@Tag(name = "景点模块")
@RestController
@RequestMapping("scenic/spot")
@RequiredArgsConstructor
public class ScenicSpotController {

    private final ScenicSpotBusiness scenicSpotBusiness;

    @Operation(summary = "分页获取5A景点")
    @GetMapping("5a")
    public Result<IPage<ScenicSpotVO>> listOf5A(@Validated ScenicSpotPageParam pageParam) {
        return ResultUtils.success(scenicSpotBusiness.listOf5A(pageParam));
    }
}
