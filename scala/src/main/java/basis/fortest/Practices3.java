package basis.fortest;

import java.util.ArrayList;

/**
 * @author luojun
 * @create 2021-08-04 22:11
 */
public class Practices3 {
    static boolean matchs(int num) {
        int a = num / 1000;
        int b = (num % 1000) / 100;
        int c = (num % 100) / 10;
        int d = num % 10;
//        System.out.println(a + "\t" + b + "\t" + c + "\t" + d);

        if ((a + b * 10) * (c + d * 10) == num) return true;
        else if ((a + b * 10) * (c * 10 + d) == num) return true;
        else if ((a * 10 + b) * (c + d * 10) == num) return true;
        else if ((a * 10 + b) * (c * 10 + d) == num) return true;
        else if ((a + c * 10) * (b + d * 10) == num) return true;
        else if ((a + c * 10) * (b * 10 + d) == num) return true;
        else if ((a * 10 + c) * (b * 10 + d) == num) return true;
        else if ((a * 10 + c) * (b + d * 10) == num) return true;
        else if ((a + d * 10) * (b + c * 10) == num) return true;
        else if ((a + d * 10) * (b * 10 + c) == num) return true;
        else if ((a * 10 + d) * (b * 10 + c) == num) return true;
        else if ((a * 10 + d) * (b + c * 10) == num) return true;
        else return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 999; i < 10000; i++) {
            if (matchs(i)) list.add(i);
        }
        System.out.println(list);
    }
}
