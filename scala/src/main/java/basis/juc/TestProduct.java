package basis.juc;

/**
 * @author luojun
 * @create 2021-10-05 10:25
 */
public class TestProduct {
    public static void main(String[] args) {

        Clerk clerk = new Clerk();

        Thread productorThread = new Thread(new Productor(clerk));

        Thread consumerThread = new Thread(new Consumer(clerk));

        productorThread.start();

        consumerThread.start();

    }
}

class Clerk {
    private int product = 0;

    public synchronized void addProduct() {
        if (product >= 20) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            product++;
            System.out.println("生产者生产了第 " + product + " 个产品;");
            notifyAll();
        }
    }

    public synchronized void getProduct() {
        if (this.product <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("消费者取走了第 " + product + "个产品");
            product--;
            notifyAll();
        }
    }
}

class Productor implements Runnable {

    Clerk clerk;

    public Productor(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("生产者开始生产产品");
        while (true){
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.addProduct();
        }
    }
}

class Consumer implements Runnable{
    Clerk clerk;

    public Consumer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("消费者开始取走产品");
        while (true){
            try {
                Thread.sleep((int)Math.random()*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.getProduct();
        }
    }
}