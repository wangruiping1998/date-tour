package cn.wangruiping.tour.db.service;

import cn.wangruiping.tour.db.entity.UserEntity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 *
 * @author wrp
 * @since 2026年03月11日 14:06
 **/
public interface UserService extends IService<UserEntity> {

    UserEntity getByUsername(String username);
}
