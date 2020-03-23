package com.aaron.design.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target){
        this.target = target;
    }
    //proxy 代表动态代理对象 method:代表正在执行的方法 args 代表单签执行方法传入的实参
    //返回值 表示当前执行方法的返回值
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("处理前打印日志");
        Object invoke = method.invoke(target, args);
        System.out.println("打印后打印日志");
        return invoke;
    }
}
