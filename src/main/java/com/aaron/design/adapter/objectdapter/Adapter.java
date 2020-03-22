package com.aaron.design.adapter.objectdapter;

/**
 * 对象适配器
 * 基于组合
 * 或者可以使用多实现
 */
public class Adapter implements Target {
    //组合 has a 被适配的对象
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void sampleOperation1() {
        this.adaptee.sampleOperation1();
    }

    @Override
    public void sampleOperation2() {
        System.out.println("被适配器需要适配的方法");
    }
}
