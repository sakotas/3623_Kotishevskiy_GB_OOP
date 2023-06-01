package Seminar1;

public class HotDrink extends Product {

    private final int temperature;

    public HotDrink(String kind, double price, Long id, int temperature) {
        super(kind, price, id);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return String.format("Горячий напиток: %s, Цена: %s, Температура: %s, id: %s", getKind(), getPrice(), getTemperature(), getId());
    }

}
