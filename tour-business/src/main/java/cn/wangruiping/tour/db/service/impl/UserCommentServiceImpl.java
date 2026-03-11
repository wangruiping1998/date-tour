package cn.wangruiping.tour.db.service.impl;

import cn.wangruiping.tour.db.entity.UserCommentEntity;
import cn.wangruiping.tour.db.mapper.UserCommentMapper;
import cn.wangruiping.tour.db.service.UserCommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 用户评论服务
 * @author wrp
 * @since 2026年03月11日 14:20
 **/
@Service
public class UserCommentServiceImpl extends ServiceImpl<UserCommentMapper, UserCommentEntity>
    implements UserCommentService {
}
