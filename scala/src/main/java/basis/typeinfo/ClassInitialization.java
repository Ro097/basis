package basis.typeinfo;

import java.util.Random;

/**
 * @author luojun
 * @create 2021-08-22 10:32
 */
public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws Exception {
        Class<Initable> initable = Initable.class;

        System.out.println("After creating Initable ref");
        System.out.println(Initable.STATIC_FINAL);
        System.out.println(Initable.STATIC_FINAL2);
        System.out.println(Initable2.staticNonfinal);

        Class.forName("basis.typeinfo.Initable3");

        System.out.println("After creating Initable3 ref");

        System.out.println(Initable3.staticNonFinal);
    }
}

class Initable {
    static final int STATIC_FINAL = 47;
    static final int STATIC_FINAL2 = ClassInitialization.rand.nextInt(47);

    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2 {
    static int staticNonfinal = 147;
    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3{
    static int staticNonFinal = 74;
    static {
        System.out.println("Initializing Initable3");
    }
}