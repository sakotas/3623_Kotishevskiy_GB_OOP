package Seminar1;

public abstract class Product {

    private String kind;
    private double price;
    private Long id;

    /**
     *
     * @param kind name of product
     * @param price product price
     * @param id id or bar code
     */

    public Product(String kind, double price, Long id) {
        this.kind = kind;
        this.price = price;
        this.id = id;
    }

    public Product(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public double getPrice() {
        return price;
    }

    public Long getId() {
        return id;
    }

    public int getTemperature(){
        return 0;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + kind + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
