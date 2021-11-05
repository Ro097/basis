package basis.juc;

/**
 * @author luojun
 * @create 2021-09-18 21:04
 */
public class Main {
    public static void main(String[] args) {
        Thread aa = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "::" + Thread.currentThread().isDaemon());
            while (true) {

            }
        }, "aa");

        aa.setDaemon(true);

        aa.start();


        System.out.println(Thread.currentThread().getName() + "over");
    }
}
