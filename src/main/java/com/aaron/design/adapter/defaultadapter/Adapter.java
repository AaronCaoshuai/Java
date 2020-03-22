package com.aaron.design.adapter.defaultadapter;

/**
 * 具体的适配器
 */
public class Adapter extends AbstractAdapter {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * 这是源类Adaptee也有的方法
     */
    public void sampleOperation1(){
        this.adaptee.sampleOperation1();
    }

    /**
     * 只想实现的方法
     */
    public void sampleOperation2(){
        System.out.println("被适配器需要适配的方法");
    }
}
