package com.aaron.design.proxy.dynamicproxy.jdk;

/**
 * 动态代理测试类
 * jdk动态代理
 * 首先Jdk的动态代理实现方法是依赖于接口的，首先使用接口来定义好操作的规范。
 * 然后通过Proxy类产生的代理对象调用被代理对象的操作，
 * 而这个操作又被分发给InvocationHandler接口的 invoke方法具体执行
 */
public class JDKProxyTest {
    public static void main(String[] args) {
        Subject subject = new SubjectImpl();

        Subject proxy =(Subject)ProxyFactory.getProxy(subject);

        System.out.println(proxy.getClass());

        proxy.action();

    }
}
