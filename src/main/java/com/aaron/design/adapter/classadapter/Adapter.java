package com.aaron.design.adapter.classadapter;

/**
 * 类适配器
 * 基于继承
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void sampleOperation2() {
        System.out.println("由于源类没有这个方法适配器补充该方法");
    }
}
