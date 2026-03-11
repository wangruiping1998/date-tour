package cn.wangruiping.tour.db.service.impl;

import cn.wangruiping.tour.db.entity.RegionEntity;
import cn.wangruiping.tour.db.mapper.RegionMapper;
import cn.wangruiping.tour.db.service.RegionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 行政区划业务服务
 * @author wrp
 * @since 2026年03月11日 14:01
 **/
@Service
public class RegionServiceImpl extends ServiceImpl<RegionMapper, RegionEntity>
    implements RegionService {
}
