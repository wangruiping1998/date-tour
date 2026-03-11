package cn.wangruiping.tour.db.entity;

import cn.wangruiping.tour.common.domain.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户景点打卡
 * @author wrp
 * @since 2026年03月11日 14:08
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@TableName(value = "public.user_spot_checkins", autoResultMap = true)
public class UserSpotCheckinsEntity extends BaseEntity {
    private Long userId;
    private Long spotId;
}
