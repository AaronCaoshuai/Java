package com.aaron.design.proxy.staticproxy;

/**
 * 静态代理测试类
 * 1.可以做到在不修改目标对象的功能前提下,对目标功能扩展.
 * 2.缺点:
 *
 * 因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.
 * 同时,一旦接口增加方法,目标对象与代理对象都要维护.
 *
 * 代理模式可以在不修改被代理对象的基础上(符合开闭原则)，通过扩展代理类，进行一些功能的附加与增强。
 * 代理类和被代理类应该共同实现一个接口,或者是共同继承某个类,代理类是事先编写,编译好的,不是在程序运行中
 * 动态生成的,因此这个例子是一个静态代理
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        UserDaoProxy proxy = new UserDaoProxy(new UserDao());
        proxy.save();
    }
}
