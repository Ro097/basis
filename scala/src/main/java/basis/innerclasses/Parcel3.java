package basis.innerclasses;

/**
 * @author luojun
 * @create 2021-08-16 21:50
 */
public class Parcel3 {
    class Contents{
        private int i = 11;
        public int value(){
            return 1;
        }
    }
    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel(){
            return label;
        }
    }

    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        Contents contents = p.new Contents();
        Destination d = p.new Destination("luojun");
    }
}
