package com.aaron.design.factory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new HongMiFactory();
        phoneFactory.getCpu().run();
        phoneFactory.getScreen().size();

        phoneFactory = new XiaoMiFactory();
        phoneFactory.getCpu().run();
        phoneFactory.getScreen().size();
    }
}
