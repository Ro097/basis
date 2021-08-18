package basis.holding;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author luojun
 * @create 2021-08-18 22:18
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(47);
        Set<Integer> intset = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            intset.add(random.nextInt(30) +(1 << 16));
        }
        System.out.println(intset);
        System.out.println(1<<1);
        System.out.println(1<<2);
        System.out.println(1<<3);
        System.out.println(1<<16);
    }
}
