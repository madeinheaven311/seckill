package com.xxxx.seckill.exception;


import com.xxxx.seckill.vo.RespBean;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public RespBean ExceptionHandler(Exception e) {
        e.printStackTrace();
        if (e instanceof GlobalException) {
            return RespBean.error(((GlobalException) e).getRespBeanEnum());
        }
        return RespBean.error();
    }
}
