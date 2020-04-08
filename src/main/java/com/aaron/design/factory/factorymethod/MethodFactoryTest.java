package com.aaron.design.factory.factorymethod;

import com.aaron.design.factory.product.Animal;

public class MethodFactoryTest {

    public static void main(String[] args) {
        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.eat();

        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.eat();
    }
}
