package cn.wangruiping.tour.db.entity;

import cn.wangruiping.tour.common.domain.BaseEntity;
import cn.wangruiping.tour.common.typehandler.Array2ListTypeHandler;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 用户评论
 * @author wrp
 * @since 2026年03月11日 14:18
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@TableName(value = "public.user_comment", autoResultMap = true)
public class UserCommentEntity extends BaseEntity {
    private Long userId;
    private Long dataId;
    private Long parentId;
    private String content;
    @TableField(typeHandler = Array2ListTypeHandler.class)
    private List<String> pics;
}
