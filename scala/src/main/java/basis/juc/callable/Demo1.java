package basis.juc.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author luojun
 * @create 2021-09-19 16:31
 */
public class Demo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new Thread(new MyThread1(),"aa").start();
//        new Thread(new MyThread2(),"bb").start();

        //FutureTask
        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread2());

        //lam表达式
        FutureTask<Integer> futureTask2 = new FutureTask<>(()->{
            System.out.println(Thread.currentThread().getName() + " com in callable");
            return 1024;
        });

        new Thread(futureTask2,"aa").start();

        while (!futureTask2.isDone()) System.out.println("wait");

        //调用FutureTask的返回值。
        System.out.println(futureTask2.get());

        System.out.println(futureTask2.get());

        System.out.println(Thread.currentThread().getName() + " over");

    }
}

class MyThread1 implements Runnable{

    @Override
    public void run() {

    }
}

class MyThread2 implements Callable{
    @Override
    public Integer call() throws Exception {
        return 200;
    }
}