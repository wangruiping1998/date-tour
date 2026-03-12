package cn.wangruiping.tour.common.exception;

import cn.dev33.satoken.exception.NotLoginException;
import cn.wangruiping.tour.common.domain.Result;
import cn.wangruiping.tour.common.util.ResultUtils;
import io.swagger.v3.oas.annotations.Hidden;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.util.stream.Collectors;

/**
 * @author wrp
 * @since 2025年07月04日 21:25
 */
@Hidden // 解决knite4j版本不兼容导致的问题
@RestControllerAdvice
@Slf4j
public class GlobalExceptionControllerAdvice {

    @ExceptionHandler(NotLoginException.class)
    public Result<Void> handlerException(NotLoginException e) {
        return ResultUtils.error(e.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result<Void> MethodArgumentNotValidException(MethodArgumentNotValidException e) {
        return ResultUtils.error(e.getFieldErrors()
                .stream()
                .map(f-> f.getField() + ":" + f.getDefaultMessage())
                .collect(Collectors.joining(";"))
        );
    }

    @ExceptionHandler(NoResourceFoundException.class)
    public Result<Void> handleNoResourceFoundException(NoResourceFoundException e) {
        return ResultUtils.error(e.getLocalizedMessage());
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public Result<Void> handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        return ResultUtils.error(e.getLocalizedMessage());
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public Result<Void> handleMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException e) {
        return ResultUtils.error("参数格式不正确");
    }

    @ExceptionHandler(Exception.class)
    public Result<Void> fallback(Exception e) {
        if(e instanceof BaseException baseException) {
            return ResultUtils.error(baseException.getMessage());
        }

        log.error("系统遇到未知的错误", e);
        return ResultUtils.error("系统遇到未知的错误");
    }
}
