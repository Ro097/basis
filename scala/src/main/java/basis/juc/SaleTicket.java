package basis.juc;

/**
 * @author luojun
 * @create 2021-09-18 21:19
 */
public class SaleTicket {
    public static void main(String[] args) {

        Ticket ticket = new Ticket();

        //创建线程
        Thread aa = new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                ticket.sale();
            }
        }, "aa");

        Thread bb = new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                ticket.sale();
            }
        }, "bb");

        Thread cc = new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                ticket.sale();
            }
        }, "cc");

        aa.start();
        bb.start();
        cc.start();
    }

}

class Ticket {
    //票数
    private int number = 30;

    public synchronized void sale() {
        //输出
        if (number > 0) {
            System.out.println(Thread.currentThread().getName() + "卖出： " + (number--) + "剩下" + number);
        }
    }
}
