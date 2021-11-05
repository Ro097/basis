package basis.juc.threads;

/**
 * @author luojun
 * @create 2021-10-07 10:50
 */
public class Test1 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();

        mt.start();
    }
}

class MyThread extends Thread {
    public MyThread() {
        super();
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("子线程：" + (i++));
        }
    }
}
