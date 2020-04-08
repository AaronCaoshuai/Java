package com.aaron.design.factory.simplefactory;

import com.aaron.design.factory.product.Animal;
import com.aaron.design.factory.product.Cat;
import com.aaron.design.factory.product.Dog;
import com.aaron.design.factory.product.Pig;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        simpleFactoryTest();
        staticMethodFactoryTest();
    }

    public static void simpleFactoryTest(){
        Animal cat = AnimalFactory.createAnimal("cat");
        cat.eat();
        Animal dog = AnimalFactory.createAnimal("dog");
        dog.eat();
        Animal pig = AnimalFactory.createAnimal("pig");
        pig.eat();
    }

    public static void staticMethodFactoryTest(){
        Cat cat = AnimalFactory2.createCat();
        cat.eat();
        Dog dog = AnimalFactory2.createDog();
        dog.eat();
        Pig pig = AnimalFactory2.createPig();
        pig.eat();
    }
}
