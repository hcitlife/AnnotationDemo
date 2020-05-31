package com.hc.demo1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 功能：注解类的实现
 */
@Component
@Aspect
public class MyAnnotationAspectImpl {

    @Pointcut("@annotation(com.hc.demo1.MyAnnotation)")
    private void pointCut() {
        System.out.println("pointCut");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around 1");
        try {
            joinPoint.proceed();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("around 2");
    }

    @Before("pointCut()")
    public void before() {
        System.out.println("before");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("after");
    }

}
