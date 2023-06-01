package Seminar1;

public class Cheburek extends Product {
    public Cheburek(String kind, double price, Long id) {
        super(kind, price, id);
    }

    public Cheburek(String kind) {
        super(kind);
    }

    @Override
    public String toString() {
        return String.format("У чебурека: %s, %s, %s", getKind(), getPrice(), getId());
    }

}
