package com.aaron.design.adapter.defaultadapter;

/**
 * 缺省适配器
 * 子类可以继承该缺省适配器
 * 来指定其需要实现的方法的具体的实现
 */
public abstract class AbstractAdapter implements Target{
    /**
     * 这是源类Adaptee也有的方法
     */
    public void sampleOperation1(){}

    /**
     * 这是源类Adaptee没有的方法
     */
    public void sampleOperation2(){
        System.out.println("需要实现的方法");
    }

    /**
     * 这是源类Adaptee没有的方法
     */
    public void sampleOperation3(){
        System.out.println("不想实现的方法");
    }
}
