package cn.wangruiping.tour.common.dict;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author wrp
 * @since 2025年07月04日 20:38
 */
@AllArgsConstructor
@Getter
public enum ResultCode implements BaseEnum {
    SUCCESS(1, "成功"),
    ERROR(0, "失败")
    ;

    @EnumValue
    private final Integer code;
    private final String value;
}
