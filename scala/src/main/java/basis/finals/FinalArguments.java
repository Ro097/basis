package basis.finals;

/**
 * @author luojun
 * @create 2021-08-10 22:32
 */
public class FinalArguments {

    void with(final Gizmo g){

    }

    void without(Gizmo g){
        g = new Gizmo();
        g.spin();
    }
    int g(final int i){
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.with(null);
        bf.without(null );
    }
}

class Gizmo {
    public void spin() {
    }
}
