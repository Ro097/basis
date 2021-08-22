package basis.typeinfo;

/**
 * @author luojun
 * @create 2021-08-21 23:34
 */
public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() +
                " is interface?[" + cc.isInterface() + "]");

        System.out.println("Simple name: " + cc.getSimpleName());

        System.out.println("Canonical name :" + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;

        try {
            c = Class.forName("basis.typeinfo.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Can't find FancyToy");
            System.exit(1);
        }
        for (Class face : c.getInterfaces()) {
            printInfo(face);
            System.out.println();
        }
        Class up = c.getSuperclass();

        Object object = null;

        try {
            object = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        }
        System.out.println("++++++++++++");
        printInfo(object.getClass());

        System.out.println("==============");

        printInfo(c);

        System.out.println("==============");

        ((Toy)object).test();
    }

}

interface HasBatterires {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
    Toy() {
    }

    Toy(int i) {
    }

    public  void test() {
        System.out.println("hello");
    }

}

class FancyToy extends Toy implements HasBatterires, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}
