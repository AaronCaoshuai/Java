package com.aaron.design.proxy.dynamicproxy.jdk;

/**
 * 接口实现类
 */
public class SubjectImpl implements Subject {
    @Override
    public void action() {
        System.out.println("subject action impl");
    }
}
