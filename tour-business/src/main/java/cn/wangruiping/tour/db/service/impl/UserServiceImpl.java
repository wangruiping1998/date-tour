package cn.wangruiping.tour.db.service.impl;

import cn.wangruiping.tour.db.entity.UserEntity;
import cn.wangruiping.tour.db.mapper.UserMapper;
import cn.wangruiping.tour.db.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 用户服务
 * @author wrp
 * @since 2026年03月11日 14:06
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity>
    implements UserService {
}
