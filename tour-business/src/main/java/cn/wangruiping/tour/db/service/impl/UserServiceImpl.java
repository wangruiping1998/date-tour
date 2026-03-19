package cn.wangruiping.tour.db.service.impl;

import cn.wangruiping.tour.db.entity.UserEntity;
import cn.wangruiping.tour.db.mapper.UserMapper;
import cn.wangruiping.tour.db.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * 用户服务
 * @author wrp
 * @since 2026年03月11日 14:06
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity>
    implements UserService {

    @Override
    public UserEntity getByUsername(String username) {
        if(!StringUtils.hasText(username)) {
            return null;
        }

        return getOne(new LambdaQueryWrapper<UserEntity>()
                .eq(UserEntity::getUsername, username));
    }

    @Override
    public UserEntity getByPhone(String phone) {
        if(!StringUtils.hasText(phone)) {
            return null;
        }

        return getOne(new LambdaQueryWrapper<UserEntity>()
                .eq(UserEntity::getPhone, phone));
    }
}
