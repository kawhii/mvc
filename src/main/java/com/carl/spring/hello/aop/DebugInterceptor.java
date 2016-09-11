package com.carl.spring.hello.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

/**
 * @author Carl
 * @date 2016/9/11
 * @modify 版权所有.(c)2008-2016.广州市森锐电子科技有限公司
 */
@Component("debugInterceptor")
public class DebugInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("Before: invocation=[" + methodInvocation + "]");
        Object rval = methodInvocation.proceed();
        System.out.println("Invocation returned");
        return rval;
    }
}
