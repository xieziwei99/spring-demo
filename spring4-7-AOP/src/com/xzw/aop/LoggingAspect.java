package com.xzw.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author xieziwei99
 * 2020-06-16
 */
@Component
@Aspect
public class LoggingAspect {

    /*
    任意 public 可见性和任意返回值类型
    包名下的任意类的任意方法
    任意参数
     */
    @Before("execution(* com.xzw.aop.*.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("method " + methodName + "() begins with " + Arrays.toString(args));
    }
}
