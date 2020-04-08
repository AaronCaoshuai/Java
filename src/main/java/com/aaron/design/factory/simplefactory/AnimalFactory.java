package com.aaron.design.factory.simplefactory;

import com.aaron.design.factory.product.Animal;
import com.aaron.design.factory.product.Cat;
import com.aaron.design.factory.product.Dog;
import com.aaron.design.factory.product.Pig;

/**
 * 动物工厂类
 */
public class AnimalFactory {

    public static Animal createAnimal(String type){
        if("cat".equals(type)){
            return new Cat();
        }else if("dog".equals(type)){
            return new Dog();
        }else if("pig".equals(type)){
            return new Pig();
        }else{
            return null;
        }
    }
}
