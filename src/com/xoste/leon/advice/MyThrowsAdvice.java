package com.xoste.leon.advice;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * @author Xoste
 */
public class MyThrowsAdvice implements ThrowsAdvice {
    public void afterThrowing(Exception ex) throws Throwable {
        System.out.println("执行异常通知：Schema-Based");
    }
    public void afterThrowing(Method m, Object[] args, Object target, Exception ex) {
        System.out.println("执行异常通知");
    }

}
