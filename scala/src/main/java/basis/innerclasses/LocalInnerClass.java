package basis.innerclasses;

/**
 * @author luojun
 * @create 2021-08-17 22:43
 */
public class LocalInnerClass {
    private int count = 0;


    Counter getCounter(String name){
        class LocalCounter implements Counter{
            public LocalCounter() {
                System.out.println("LocalCounter()");
            }

            @Override
            public int next() { 
                return count++;
            }
        }
        return new LocalCounter();
    }

    Counter getCounter2(String name){
        return new Counter() {
            {
                System.out.println("Counter");
            }

            @Override
            public int next() {
                System.out.print(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter c1 = lic.getCounter("Local inner "),
                c2 = lic.getCounter2("Anonymous inner ");
        for (int i = 0; i < 5; i++) {
            System.out.println(c1.next());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(c2.next());
        }
    }
}

interface Counter {
    int next();
}
