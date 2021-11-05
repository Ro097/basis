package basis.juc;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author luojun
 * @create 2021-09-18 23:56
 */
public class ThreadDemo4 {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();

        //1 Vector
//        List<String> list = new Vector<>();


//        List<String> list = Collections.synchronizedList(new ArrayList<>());
        List<String> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(list);
            }, String.valueOf(i)).start();
        }
    }
}
