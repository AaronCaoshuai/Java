package com.aaron.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程--实现Callable<T>接口
 */
public class CallerTask {

    public static class CallerTest implements Callable<String>{

        @Override
        public String call() throws Exception {
            return "创建线程使用实现Callable<T>接口";
        }
    }

    public static void main(String[] args) {
        //创建异步任务
        FutureTask<String> futureTask = new FutureTask<>(new CallerTest());
        //启动线程
        new Thread(futureTask).start();
        try {
            //等待任务执行完毕返回结果
            String result = futureTask.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
