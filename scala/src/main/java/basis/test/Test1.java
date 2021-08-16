package basis.test;

/**
 * @author luojun
 * @create 2021-08-04 22:36
 */
public class Test1 {
    String s = "luojun";
    Test1(String n){
        System.out.println(n);
    }
    public static void main(String[] args) {
        Test1 t1 = new Test1("luo");
        System.out.println(t1.s);
    }
}
