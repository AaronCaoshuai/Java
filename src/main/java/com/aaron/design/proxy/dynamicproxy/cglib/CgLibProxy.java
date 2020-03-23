package com.aaron.design.proxy.dynamicproxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib 拦截器的类
 */
public class CgLibProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法执行前日志打印");

        Object retObj = methodProxy.invokeSuper(o, objects);

        System.out.println("方法执行后日志打印");
        return retObj;
    }
}
