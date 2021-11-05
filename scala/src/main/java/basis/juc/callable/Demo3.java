package basis.juc.callable;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author luojun
 * @create 2021-09-19 18:45
 */
public class Demo3 {

    private static final int NUMBER = 7;

    public static void main(String[] args) {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(NUMBER, () -> {
            System.out.println("7777");
        });

        for (int i = 0; i < 7; i++) {
            new Thread(() -> {
                //等待
                try {
                    System.out.println("你是：" + Thread.currentThread().getName());
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }, String.valueOf(i)).start();
        }
    }
}
