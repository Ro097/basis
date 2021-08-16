package basis.fortest;

import java.util.ArrayList;

/**
 * @author luojun
 * @create 2021-08-03 0:06
 */
public class Practies2 {
    ArrayList<Integer> match(int num) {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        for (int i = 3; i < num; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0 ) {
                    break;
                }
            }
        }
        return ints;
    }

    public static void main(String[] args) {
        Practies2 p2 = new Practies2();
        ArrayList<Integer> integers = p2.match(10);
        System.out.println(integers);
    }
}
