package cn.wangruiping.tour.db.entity;

import cn.wangruiping.tour.common.domain.BaseEntity;
import cn.wangruiping.tour.common.typehandler.Array2ListTypeHandler;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 景点旅游分享
 * @author wrp
 * @since 2026年03月11日 14:14
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@TableName(value = "public.spot_travel_share", autoResultMap = true)
public class SpotTravelShareEntity extends BaseEntity {
    private Long userId;
    private Long spotId;
    private String content;
    @TableField(typeHandler = Array2ListTypeHandler.class)
    private List<String> pics;
    private Integer star;
}
