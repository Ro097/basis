package basis.polymorphism;


/**
 * @author luojun
 * @create 2021-08-11 22:22
 */
public class Sandwich extends PortableLunch{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();

    public Sandwich() {
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}
class Meal {
    private Bread d = new Bread();
    public Meal() {
        System.out.println("Meal()");
    }
}
class Bread{
    public Bread() {
        System.out.println("Bread()");
    }
}
class Cheese{
    public Cheese() {
        System.out.println("Cheese()");
    }
}
class Lettuce{
    public Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal{
    private Lettuce l = new Lettuce();
    public Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch{
    public PortableLunch() {
        System.out.println("PortableLunch()");
    }
}
