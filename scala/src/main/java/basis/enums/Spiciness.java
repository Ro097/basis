package basis.enums;

/**
 * @author luojun
 * @create 2021-08-09 0:13
 */
public class Spiciness {
    public static void main(String[] args) {
        Spicines howHot = Spicines.MEDIUM;
        System.out.println(howHot.getName());
        System.out.println(howHot.getDec());
        for (Spicines p : Spicines.values()) {
            System.out.println(p + ", ordinal " + p.ordinal());
        }
    }
}

enum Spicines {
    NOT("1", "2"),
    MILO("3", "4"),
    MEDIUM("5", "6"),
    HOT("7", "8"),
    FLAMING("9", "10");


    private final String name;
    private final String dec;

    private Spicines(String name, String dec) {
        this.name = name;
        this.dec = dec;
    }

    public String getName() {
        return name;
    }

    public String getDec() {
        return dec;
    }
}