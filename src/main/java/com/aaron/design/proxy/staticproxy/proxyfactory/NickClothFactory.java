package com.aaron.design.proxy.staticproxy.proxyfactory;

/**
 * 接口实现类
 */
public class NickClothFactory implements ClothFactory {
    @Override
    public void productCloth() {
        System.out.println("nick工厂生产nick");
    }
}
