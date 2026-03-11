package cn.wangruiping.tour.business;

import cn.wangruiping.tour.business.param.ScenicSpotPageParam;
import cn.wangruiping.tour.business.vo.ScenicSpotVO;
import cn.wangruiping.tour.db.entity.ScenicSpotEntity;
import cn.wangruiping.tour.db.service.ScenicSpotService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * 景点业务
 *
 * @author wrp
 * @since 2026年03月11日 14:47
 **/
@Service
@RequiredArgsConstructor
public class ScenicSpotBusiness {

    private final ScenicSpotService scenicSpotService;


    public IPage<ScenicSpotVO> listOf5A(ScenicSpotPageParam pageParam) {
        IPage<ScenicSpotEntity> spots = scenicSpotService.page(
                new Page<>(pageParam.getPageNo(), pageParam.getPageSize()),
                new LambdaQueryWrapper<ScenicSpotEntity>()
                        .eq(ScenicSpotEntity::getLevel, pageParam.getLevel())
                        .orderByAsc(ScenicSpotEntity::getPac)
        );

        IPage<ScenicSpotVO> result = new Page<>();
        BeanUtils.copyProperties(spots, result);
        if (!spots.getRecords().isEmpty()) {
            result.setRecords(spots.getRecords()
                    .stream()
                    .map(ScenicSpotVO::from)
                    .toList()
            );
        }

        return result;
    }
}
