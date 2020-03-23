package com.aaron.design.proxy.staticproxy.proxyfactory;

/**
 * 代理工厂测试
 */
public class FactoryProxyTest {
    public static void main(String[] args) {
        ClothFactory clothFactory = new NickClothFactory();
        ProxyFactory proxyFactory = new ProxyFactory(clothFactory);
        proxyFactory.productCloth();
    }
}
