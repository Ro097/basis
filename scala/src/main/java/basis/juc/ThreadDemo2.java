package basis.juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author luojun
 * @create 2021-09-18 23:11
 */
public class ThreadDemo2 {

    public static void main(String[] args) {
        Share1 share1 = new Share1();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                share1.incr();
            }
        },"aa").start();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                share1.decr();
            }
        },"bb").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                share1.incr();
            }
        },"cc").start();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                share1.decr();
            }
        },"dd").start();
    }

}

class Share1 {
    private int num = 0;
    private Lock lock = new ReentrantLock(false);

    private Condition condition = lock.newCondition();

    public void incr() {
        lock.lock();
        try {
            while (num != 0) condition.await();
            num++;
            System.out.println(Thread.currentThread().getName() + ":: " + num);
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void decr(){
        lock.lock();
        try {
            while (num != 1) condition.await();
            num--;
            System.out.println(Thread.currentThread().getName() + ":: " + num);
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
