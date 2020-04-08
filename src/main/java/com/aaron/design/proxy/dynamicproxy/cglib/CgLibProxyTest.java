package com.aaron.design.proxy.dynamicproxy.cglib;

import java.io.IOException;

/**
 * cglib代理测试类
 * CGLIB原理：动态生成一个要代理类的子类，子类重写要代理的类的所有不是final的方法。
 * 在子类中采用方法拦截的技术拦截所有父类方法的调用，顺势织入横切逻辑。
 * 它比使用java反射的JDK动态代理要快。
 *
 * CGLIB底层：使用字节码处理框架ASM，来转换字节码并生成新的类。
 * 不鼓励直接使用ASM，因为它要求你必须对JVM内部结构包括class文件的格式和指令集都很熟悉。
 *
 * CGLIB缺点：对于final方法，无法进行代理。
 *
 */
public class CgLibProxyTest {

    public static void main(String[] args) throws IOException {
        Subject cgLibProxy = (Subject)ProxyFactory.getCgLibProxy(new Subject());
        cgLibProxy.action();
    }
}
