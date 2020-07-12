package com.aaron.multithreading;

/**
 * 创建线程--实现Runnable接口
 */
public class RunnableTask  {

    public static class RunnableTest implements Runnable{

        @Override
        public void run() {
            System.out.println("实现Runnable接口创建线程");
        }
    }

    public static void main(String[] args) {
        RunnableTest task1 = new RunnableTest();
        new Thread(task1).start();
        new Thread(task1).start();
    }

}
