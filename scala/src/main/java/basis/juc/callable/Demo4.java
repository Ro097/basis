package basis.juc.callable;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author luojun
 * @create 2021-09-19 20:42
 */
public class Demo4 {

    public static final int NUMBER = 3;

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(NUMBER);

        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + "抢到了车位");

                    //设置停车时间
                    TimeUnit.SECONDS.sleep(5);

                    System.out.println(Thread.currentThread().getName() + "-----离开了车位");


                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                }
            }, String.valueOf(i)).start();
        }
    }
}
