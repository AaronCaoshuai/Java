package com.aaron.design.proxy.dynamicproxy.jdk;

import java.lang.reflect.Proxy;

/**
 * 代理工厂 获取代理类
 */
public class ProxyFactory {

    public static Object getProxy(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),new MyInvocationHandler(target));
    }
}
