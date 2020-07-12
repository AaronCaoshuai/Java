package com.aaron.multithreading;

/**
 * 创建线程--继承Thread类
 */
public class ThreadTest {

    public static class MyThread extends Thread{
        //覆写其run()方法
        @Override
        public void run() {
            System.out.println("继承Thread类方式创建线程");
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
