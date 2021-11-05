package basis.juc;

/**
 * @author luojun
 * @create 2021-09-18 22:40
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        Share share = new Share();

        new Thread(()->{
            for (int i = 1; i < 10; i++) {
                try {
                    share.incr();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"aa").start();

        new Thread(()->{
            for (int i = 1; i < 10; i++) {
                try {
                    share.decr();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"bb").start();
        new Thread(()->{
            for (int i = 1; i < 10; i++) {
                try {
                    share.incr();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"cc").start();

        new Thread(()->{
            for (int i = 1; i < 10; i++) {
                try {
                    share.decr();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"dd").start();
    }
}

class Share{
    //初始值
    private int num = 0;

    public synchronized  void incr() throws InterruptedException {
        //判断干活通知

        while (num != 0){
            this.wait();
        }
        num ++;

        System.out.println(Thread.currentThread().getName() + ":: " + num);

        this.notifyAll();

    }

    public synchronized void decr() throws InterruptedException {
        //判断干活通知

        if (num != 1){
            this.wait();
        }
        num --;

        System.out.println(Thread.currentThread().getName() + ":: " + num);

        this.notifyAll();

    }
}