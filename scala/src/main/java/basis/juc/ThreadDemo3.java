package basis.juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author luojun
 * @create 2021-09-18 23:37
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        Share3 share3 = new Share3();

        new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                share3.test1(i);
            }
        }, "aa").start();
        new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                share3.test2(i);
            }
        }, "bb").start();
        new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                share3.test3(i);
            }
        }, "cc").start();
    }
}

class Share3 {
    //定义标志位
    private int flag = 1;

    //创建锁
    private Lock lock = new ReentrantLock();

    //创建三个Condition
    private Condition cd1 = lock.newCondition();
    private Condition cd2 = lock.newCondition();
    private Condition cd3 = lock.newCondition();


    public void test1(int loop) {
        lock.lock();

        try {
            while (flag != 1) cd1.await();
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "::" + "轮数" + loop);
            }
            flag = 2;//先修改修改标志位
            cd2.signal();//通知BB线程
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void test2(int loop) {
        lock.lock();

        try {
            while (flag != 2) cd2.await();
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "::" + "轮数" + loop);
            }
            flag = 3;//先修改修改标志位
            cd3.signal();//通知cc线程
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void test3(int loop) {
        lock.lock();

        try {
            while (flag != 3) cd3.await();
            for (int i = 0; i < 15; i++) {
                System.out.println(Thread.currentThread().getName() + "::" + "轮数" + loop);
            }
            flag = 1;//先修改修改标志位
            cd1.signal();//通知AA线程
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}