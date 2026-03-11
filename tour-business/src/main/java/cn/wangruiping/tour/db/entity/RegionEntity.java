package cn.wangruiping.tour.db.entity;

import cn.wangruiping.tour.common.domain.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 行政区划
 * @author wrp
 * @since 2026年03月11日 14:00
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@TableName(value = "public.region", autoResultMap = true)
public class RegionEntity extends BaseEntity {
    private String pac;
    private String pacName;
    private Double centricLng;
    private Double centricLat;
}
