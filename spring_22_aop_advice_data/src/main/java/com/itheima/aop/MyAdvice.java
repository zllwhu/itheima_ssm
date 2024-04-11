package com.itheima.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.itheima.dao.BookDao.findName(..))")
    public void pt() {
    }

//    @Before("pt()")
    public void before(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice ...");
    }

//    @After("pt()")
    public void after(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("after advice ...");
    }

//    @Around("pt()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) {
        Object[] args = proceedingJoinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        args[0] = 666;
        System.out.println("around before advice ...");
        Object ret = null;
        try {
            ret = proceedingJoinPoint.proceed(args);
        } catch (Throwable e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        System.out.println("around after advice ...");
        return ret;
    }

//    @AfterReturning(value = "pt()", returning = "ret")
    public void afterReturning(Object ret) {
        System.out.println("afterReturning advice ..." + ret);
    }

    @AfterThrowing(value = ("pt()"), throwing = "t")
    public void afterThrowing(Throwable t) {
        System.out.println("afterThrowing advice ...");
    }
}
