package com.aaron.design.factory.abstractfactory;

import com.aaron.design.factory.product.seriesproducts.Cpu;
import com.aaron.design.factory.product.seriesproducts.Cpu825;
import com.aaron.design.factory.product.seriesproducts.Screen;
import com.aaron.design.factory.product.seriesproducts.Screen7;

/**
 * 小米手机工厂
 */
public class XiaoMiFactory implements PhoneFactory {
    @Override
    public Cpu getCpu() {
        return new Cpu825();
    }

    @Override
    public Screen getScreen() {
        return new Screen7();
    }
}
