package basis.juc;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author luojun
 * @create 2021-09-18 21:54
 */
public class LSaleTicket {
    public static void main(String[] args) {
        LTicket lTicket = new LTicket();

        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                lTicket.sale();
            }
        }, "aa").start();

        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                lTicket.sale();
            }
        }, "bb").start();

        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                lTicket.sale();
            }
        }, "cc").start();
    }
}

class LTicket {
    //票数
    private int number = 30;

    //创建可重入锁
    private final ReentrantLock lock = new ReentrantLock(false);

    public void sale() {
        //上锁
        lock.lock();

        //判断是否有票可买
        try {
            if (number > 0) {
                System.out.println(Thread.currentThread().getName() + "卖出：" + (number--) + "剩余：" + number);
            }
        } finally {
            //释放锁
            lock.unlock();
        }
    }
}