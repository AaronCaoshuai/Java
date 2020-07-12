package com.aaron.multithreading;

/**
 * 当一个线程调用共享对象的wait()方法被阻塞挂起后,如果其他线程中断了该线程,则该线程会抛出InterruptedException异常并返回.
 */
public class WaitNotifyInterupt {

    static Object obj = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (obj) {
                        System.out.println("---begin---");
                        obj.wait();
                        System.out.println("---end---");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        threadA.start();
        Thread.sleep(1000);
        System.out.println("---start interrupt threadA---");
        threadA.interrupt();
        System.out.println("---end interrupt threadA---");
    }
}
