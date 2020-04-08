package com.aaron.design.factory.product;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("狗吃东西");
    }
}
