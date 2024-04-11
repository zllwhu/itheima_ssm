package com.itheima.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
//    @Pointcut("execution(void com.itheima.dao.impl.BookDaoImpl.update())")
//    @Pointcut("execution(* com.itheima.dao.impl.BookDaoImpl.update(*))")
//    @Pointcut("execution(* com.*.*.*.*.update())")
//    @Pointcut("execution(* com.*.*.*.update())")
//    @Pointcut("execution(* *..update())")
//    @Pointcut("execution(* *..*(..))")
//    @Pointcut("execution(* *..u*(..))")
//    @Pointcut("execution(* *..*e(..))")
//    @Pointcut("execution(* com..*(..))")
//    @Pointcut("execution( * com.itheima.*.*Service.find*(..))")
    public void pt(){}

    @Before("pt()")
    public void method() {
        System.out.println(System.currentTimeMillis());
    }
}
