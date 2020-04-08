package com.aaron.design.factory.factorymethod;

import com.aaron.design.factory.product.Animal;
import com.aaron.design.factory.product.Dog;

public class DogFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
