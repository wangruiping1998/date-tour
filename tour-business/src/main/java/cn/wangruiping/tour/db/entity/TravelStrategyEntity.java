package cn.wangruiping.tour.db.entity;

import cn.wangruiping.tour.common.domain.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 旅游攻略
 * @author wrp
 * @since 2026年03月11日 14:10
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@TableName(value = "public.travel_strategy", autoResultMap = true)
public class TravelStrategyEntity extends BaseEntity {
    private Long userId;
    private Long spotId;
    private String textContent;
    private String mapContent;
}
