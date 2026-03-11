package cn.wangruiping.tour.db.entity;

import cn.wangruiping.tour.dict.ScenicSpotLevel;
import cn.wangruiping.tour.common.domain.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 景点
 * @author wrp
 * @since 2026年03月11日 13:51
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@TableName(value = "public.scenic_spot", autoResultMap = true)
public class ScenicSpotEntity extends BaseEntity {
    private String name;
    private ScenicSpotLevel level;
    private String address;
    private String description;
    private String url;
    private String pac;
    private String pacName;
    private Double centricLng;
    private Double centricLat;
}
