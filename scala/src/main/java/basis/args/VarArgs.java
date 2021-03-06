package basis.args;

/**
 * @author luojun
 * @create 2021-08-08 22:31
 */
public class VarArgs {
    static void printArray(Object... args) {
        for (Object object : args) {
            System.out.print(object + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[]{new Integer(47), new Float(3.14), new Double(11.11)});
        printArray(new Object[]{"one", "two", "three"});
        printArray(new Object[]{new A(), new A(), new A()});
        printArray((Object[])new Integer[]{1,2,3,4});
        printArray();
    }
}

class A {
}