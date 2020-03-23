package com.aaron.design.proxy.dynamicproxy.cglib;

/**
 * 需要被代理的类 没有实现接口
 */
public class Subject {

    public void action(){
        System.out.println("action 执行");
    }
}
