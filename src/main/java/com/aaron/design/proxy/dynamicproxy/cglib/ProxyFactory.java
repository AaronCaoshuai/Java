package com.aaron.design.proxy.dynamicproxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * cglib的代理工厂类
 */
public class ProxyFactory {

    public static Object getCgLibProxy(Object target){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());//对象制定生成的代理类的父类
        enhancer.setCallback(new CgLibProxy());//设置Callback对象
        Object targetProxy = enhancer.create();//通过字节码技术动态创建子类实例
        return targetProxy;//返回代理对象
    }
}
