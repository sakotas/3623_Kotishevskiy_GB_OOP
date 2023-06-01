package Seminar1;

public class Sausage extends Product {
    public Sausage(String kind, double price, Long id) {
        super(kind, price, id);
    }

    public Sausage(String kind) {
        super(kind);
    }

    @Override
    public String toString() {
        return String.format("У сосиски: %s, %s, %s", getKind(), getPrice(), getId());
    }
}
