package basis.fortest;

import sun.plugin.javascript.navig.LinkArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author luojun
 * @create 2021-08-02 23:31
 */
public class Practies1 {
    public int[] radom(int i) {
        int[] ro = new int[i];
        for (int j = 0; j < i; j++) {
            int num = (int) (Math.random() * 100) + 1;
            ro[j] = num;
        }
        return ro;
    }

    public static void main(String[] args) {

        Practies1 p1 = new Practies1();
        int[] ra = p1.radom(25);

        for (int i = 0; i < ra.length - 1; i++) {
            System.out.print(ra[i]);

            if (i < ra.length - 2) {
                if (ra[i] > ra[i + 1]) System.out.print(" > ");
                else if (ra[i] < ra[i + 1]) System.out.print(" < ");
                else System.out.print(" = ");
            }

        }


/*
        ArrayList<Integer> s1 = new ArrayList<Integer>();
        ArrayList<Integer> s2 = new ArrayList<Integer>();
        ArrayList<Integer> s3 = new ArrayList<Integer>();
        for (int i = 0; i < ra.length - 2; i++) {
            if (ra[i] > ra[i + 1]) s1.add(ra[i]);
            else if (ra[i] < ra[i + 1]) s2.add(ra[i]);
            else s3.add(ra[i]);
        }

        System.out.println(Arrays.toString(ra));

        System.out.println(">"+s1);
        System.out.println("<"+s2);
        System.out.println("="+s3);

        */
    }
}
