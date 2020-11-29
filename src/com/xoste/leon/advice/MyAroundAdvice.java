package com.xoste.leon.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author Xoste
 */
public class MyAroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕-前置");
        // 旅行，调用切点方式
        Object proceed = methodInvocation.proceed();
        System.out.println("环绕-后置");
        return proceed;
    }
}
