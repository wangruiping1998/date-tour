package cn.wangruiping.tour.business.param;

import cn.wangruiping.tour.common.domain.PageQuery;
import cn.wangruiping.tour.dict.ScenicSpotLevel;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author wrp
 * @since 2026年03月11日 14:51
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class ScenicSpotPageParam extends PageQuery  {
    @NotNull
    private ScenicSpotLevel level;
}
