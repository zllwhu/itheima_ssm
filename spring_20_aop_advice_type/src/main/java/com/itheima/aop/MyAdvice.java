package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
    public void pt(){}

    @Pointcut("execution(int com.itheima.dao.BookDao.select())")
    public void pt2(){}

//    @Before("pt()")
    public void before() {
        System.out.println("before advice ...");
    }

//    @After("pt()")
    public void after() {
        System.out.println("after advice ...");
    }

//    @Around("pt()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before advice ...");
        Object ret = proceedingJoinPoint.proceed();
        System.out.println("around after advice ...");
        return ret;
    }

//    @Around("pt2()")
    public Object aroundSelect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before advice ...");
        Integer ret = (Integer) proceedingJoinPoint.proceed();
        System.out.println("around after advice ...");
        return ret + 566;
    }

    public void afterReturning() {
        System.out.println("afterReturning advice ...");
    }

    public void afterThrowing() {
        System.out.println("afterThrowing advice ...");
    }
}
