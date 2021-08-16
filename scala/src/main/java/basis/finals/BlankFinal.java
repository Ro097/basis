package basis.finals;

/**
 * @author luojun
 * @create 2021-08-10 22:25
 */
public class BlankFinal {
    private final int i = 0;
    private final int j;
    private final Popet p;

    public BlankFinal() {
        j = 1;
        p = new Popet(1);
    }

    public BlankFinal(int x) {
        j = x;
        p = new Popet(x);
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}

class Popet {
    private int i;

    Popet(int i) {
        this.i = i;
    }
}