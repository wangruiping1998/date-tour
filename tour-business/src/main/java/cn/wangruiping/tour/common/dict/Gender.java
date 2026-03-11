package cn.wangruiping.tour.common.dict;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 性别
 * @author wrp
 * @since 2026年03月11日 14:03
 **/
@Getter
@AllArgsConstructor
public enum Gender implements BaseEnum {
    FEMALE(1, "女"),
    MALE(2, "男"),
    OTHER(3, "其他")
    ;

    @EnumValue
    private final Integer code;
    private final String value;
}
