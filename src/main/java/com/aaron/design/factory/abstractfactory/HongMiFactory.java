package com.aaron.design.factory.abstractfactory;

import com.aaron.design.factory.product.seriesproducts.Cpu;
import com.aaron.design.factory.product.seriesproducts.Cpu650;
import com.aaron.design.factory.product.seriesproducts.Screen;
import com.aaron.design.factory.product.seriesproducts.Screen5;

/**
 * 红米手机工厂
 */
public class HongMiFactory implements PhoneFactory{
    @Override
    public Cpu getCpu() {
        return new Cpu650();
    }

    @Override
    public Screen getScreen() {
        return new Screen5();
    }
}
