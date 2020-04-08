package com.aaron.design.factory.factorymethod;

import com.aaron.design.factory.product.Animal;
import com.aaron.design.factory.product.Cat;

/**
 * 具体产品的工厂类
 */
public class CatFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
