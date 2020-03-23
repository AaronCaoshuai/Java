package com.aaron.design.proxy.staticproxy.proxyfactory;

/**
 * 代理工厂
 */
public class ProxyFactory implements ClothFactory {

    private ClothFactory clothFactory;

    public ProxyFactory(ClothFactory clothFactory){
        this.clothFactory = clothFactory;
    }

    @Override
    public void productCloth() {
        System.out.println("代理工厂收取代工费");
        clothFactory.productCloth();
    }
}
