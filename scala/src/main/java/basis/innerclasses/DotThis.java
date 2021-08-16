package basis.innerclasses;

/**
 * @author luojun
 * @create 2021-08-16 22:24
 */
public class DotThis {
    void f() {
        System.out.println("f()");
    }
    public class Inner{
        public DotThis outer(){
            return DotThis.this;
        }
    }
    public Inner inner(){return new Inner();}

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        Inner dti = dt.inner();
        dti.outer().f();
    }
}
