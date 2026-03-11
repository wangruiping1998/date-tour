package cn.wangruiping.tour.db.service.impl;

import cn.wangruiping.tour.db.entity.UserSpotCheckinsEntity;
import cn.wangruiping.tour.db.mapper.UserSpotCheckinsMapper;
import cn.wangruiping.tour.db.service.UserSpotCheckinsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 用户景点打卡服务
 * @author wrp
 * @since 2026年03月11日 14:09
 **/
@Service
public class UserSpotCheckinsServiceImpl extends ServiceImpl<UserSpotCheckinsMapper, UserSpotCheckinsEntity>
    implements UserSpotCheckinsService {
}
