package basis.juc.lock;

import basis.args.Test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author luojun
 * @create 2021-10-05 17:56
 */
public class test {
    public static void main(String[] args) {

        LockTest lockTest = new LockTest();
        Thread aa = new Thread(new Test1(lockTest),"aa");

        Thread bb = new Thread(new Test1(lockTest), "bb");

        Thread cc = new Thread(new Test1(lockTest), "cc");

        aa.start();
        bb.start();
        cc.start();
    }
}

class Test1 implements Runnable {
    LockTest lockTest;

    public Test1(LockTest lockTest) {
        this.lockTest = lockTest;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            lockTest.sale();
        }
    }
}

class LockTest {
    private int number = 30;

    private final Lock lock = new ReentrantLock();

    public void sale() {
        lock.lock();

        try {
            while (number > 0) {
                System.out.println(Thread.currentThread().getName() + "卖出：" + (number--) + "剩余： " + number);
            }
        } finally {
            lock.unlock();
        }
    }
}