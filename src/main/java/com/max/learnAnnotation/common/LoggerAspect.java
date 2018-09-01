package com.max.learnAnnotation.common;


import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.imageio.IIOException;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.util.Objects;


/**
 * LoggerAspect
 *
 * @author jianwang15@iflytek.com
 * @created 2018/8/31
 */

//声明该类位切片类
@Aspect
@Component //该标签把LoggerAspect类放到IOC容器中
public class LoggerAspect {



    /**
     * 定义一个方法，用于声明切入点表达式，方法中一般不需要添加其他代码
     * 使用@Pointcut声明切入点表达式
     * 后面的通知直接使用方法名来引用当前的切点表达式；如果是其他类使用，加上包名即可
     * 拦截controller 下面的方法
     */
    @Pointcut("execution(public * com.max.learnAnnotation.controller.*.*(..))")
    public void declearJoinPointExpression(){

    }


    @Before("declearJoinPointExpression()") //该标签声明次方法是一个前置通知：在目标方法开始之前执行
    public void beforeMethod(JoinPoint joinPoint){





    }

    @After("declearJoinPointExpression()") //该标签声明次方法是一个前置通知：在目标方法开始之前执行
    public void AfterMethod(JoinPoint joinPoint){


    }

    @AfterReturning("declearJoinPointExpression()")
    public void AfterReturning(JoinPoint joinPoint){

    }

    /**
     *
     * 功能描述: 切片同意进行异常处理
     *
     * @param: * @param null
     * @return:
     * @auther: jianwang15@iflytek.com
     * @date: 2018/9/1 19:18
     */
    @AfterThrowing(value = "declearJoinPointExpression()", throwing = "e")
    public void AfterThrowing(JoinPoint joinPoint,Throwable e){

        if(e instanceof ArrayIndexOutOfBoundsException) {
            String methodName = joinPoint.getSignature().getName();
            Util.writeContent("eee");
//            return Util.error("indexOutOfArray");
        }

    }


}
