package com.aaron.design.factory.simplefactory;

import com.aaron.design.factory.product.Cat;
import com.aaron.design.factory.product.Dog;
import com.aaron.design.factory.product.Pig;

/**
 * 静态方法工厂
 */
public class AnimalFactory2 {

    public static Cat createCat(){
        return new Cat();
    }

    public static Dog createDog(){
        return new Dog();
    }

    public static Pig createPig(){
        return new Pig();
    }
}
