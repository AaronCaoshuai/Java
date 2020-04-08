package com.aaron.design.factory.product;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("猫吃东西");
    }
}
