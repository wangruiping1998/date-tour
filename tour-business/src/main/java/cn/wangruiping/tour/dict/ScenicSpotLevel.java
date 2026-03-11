package cn.wangruiping.tour.dict;

import cn.wangruiping.tour.common.dict.BaseEnum;
import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 景点等级
 * @author wrp
 * @since 2026年03月11日 13:55
 **/
@Getter
@AllArgsConstructor
public enum ScenicSpotLevel implements BaseEnum {
    LEVEL3(3, "3A"),
    LEVEL4(4, "4A"),
    LEVEL5(5, "5A"),
    ;

    @EnumValue
    private final Integer code;
    private final String value;
}
