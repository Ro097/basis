package basis.args;

/**
 * @author luojun
 * @create 2021-08-09 0:24
 */
public class Test {
    static void s(int[] r) {
        for (int d : r) {
            System.out.println(d);
        }
    }

    public static void main(String[] args) {
        s(new int[]{1,2,3,4});
    }
}
