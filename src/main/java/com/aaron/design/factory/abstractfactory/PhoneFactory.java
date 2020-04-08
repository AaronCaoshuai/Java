package com.aaron.design.factory.abstractfactory;

import com.aaron.design.factory.product.seriesproducts.Cpu;
import com.aaron.design.factory.product.seriesproducts.Screen;

/**
 * 手机抽象工厂
 */
public interface PhoneFactory {

    Cpu getCpu();


    Screen getScreen();
}
