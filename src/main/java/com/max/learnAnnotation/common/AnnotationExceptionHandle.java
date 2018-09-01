package com.max.learnAnnotation.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * AnnotationExceptionHandle
 *
 * @author jianwang15@iflytek.com
 * @created 2018/9/1
 */
// 自定义注解
//@ControllerAdvice
public class AnnotationExceptionHandle {

    @ExceptionHandler(value = ArrayIndexOutOfBoundsException.class)
    @ResponseBody
    public  String  arrayIndexOutHandle(Throwable e){
        return Util.error("indexOutOfLength" );
    }
}
