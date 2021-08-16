package basis.oop;

/**
 * @author luojun
 * @create 2021-08-04 22:31
 */
public class Practices1 {
    Practices1 (int i){
        System.out.println("Rock..."+i);
    }
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Practices1(i);
        }
    }
}
