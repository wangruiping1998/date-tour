package cn.wangruiping.tour.business.vo;

import cn.wangruiping.tour.db.entity.ScenicSpotEntity;
import cn.wangruiping.tour.dict.ScenicSpotLevel;
import lombok.Data;
import org.springframework.beans.BeanUtils;

/**
 * 景点简要视图
 * @author wrp
 * @since 2026年03月11日 14:48
 **/
@Data
public class ScenicSpotVO {
    private String name;
    private ScenicSpotLevel level;
    private String address;
    private String url;
    private String pac;
    private String pacName;

    public static ScenicSpotVO from(ScenicSpotEntity entity) {
        if(entity == null) return null;
        ScenicSpotVO vo = new ScenicSpotVO();
        BeanUtils.copyProperties(entity, vo);
        return vo;
    }
}
