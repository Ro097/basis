package basis.args;

/**
 * @author luojun
 * @create 2021-08-08 23:28
 */
public class VarargType {
    static void f(Character... args) {
        args[0]='s';
//        args[1]='s';
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
        System.out.println(" " + args[0] + args[1]);
    }

    static void g(int... args) {
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }

    public static void main(String[] args) {
        f('a','b');
//        f();
        g(1);
        g();
        System.out.println("int[]: " + new int[0].getClass());
    }
}
