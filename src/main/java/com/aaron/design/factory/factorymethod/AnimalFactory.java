package com.aaron.design.factory.factorymethod;

import com.aaron.design.factory.product.Animal;

/**
 * 抽象工厂类
 */
public abstract class AnimalFactory {

    public abstract Animal createAnimal();

}
