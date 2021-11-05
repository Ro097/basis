package basis.juc.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author luojun
 * @create 2021-10-07 14:21
 */
public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> task = new FutureTask<>(new MyThread3());

        Thread aa = new Thread(task,"aa");

        aa.start();

        while (!task.isDone()) System.out.println("wait");

        System.out.println(task.get());
        System.out.println(task.get());

        System.out.println(Thread.currentThread().getName() + "over");


    }
}

class MyThread3 implements Callable {

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "com in callable");
        return 1024;
    }
}