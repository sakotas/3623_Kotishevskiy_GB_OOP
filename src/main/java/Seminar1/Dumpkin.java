package Seminar1;

public class Dumpkin extends Product {
    public Dumpkin(String kind, double price, Long id) {
        super(kind, price, id);
    }

    public Dumpkin(String kind) {
        super(kind);
    }


    public int blankMethod(){
        return 0;
    }

    @Override
    public String toString() {
        return String.format("У пельменя: %s, %s, %s", getKind(), getPrice(), getId());
    }
}
