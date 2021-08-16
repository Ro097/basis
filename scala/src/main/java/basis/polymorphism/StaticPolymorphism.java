package basis.polymorphism;

/**
 * @author luojun
 * @create 2021-08-11 22:09
 */
public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper sup = new StaticSub();
        System.out.println(sup.dynamicGet());
        System.out.println(sup.staticGet());
    }
}
class StaticSuper{
    public static String staticGet(){
        return "Base staticGet()";
    }

    public String dynamicGet(){
        return "Base dynamicGet()";
    }
}
class StaticSub extends StaticSuper{
    public static String staticGet(){
        return "Derived staticGet";
    }

    public String dynamicGet(){
        return "Derived dynamicGet()";
    }
}
