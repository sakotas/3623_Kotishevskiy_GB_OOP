package Seminar2;

public class Human extends Actor {
    int age;
    String address;

    public Human(String name, String sex, int age, String address) {
        super(name, sex);
        this.age = age;
        this.address = address;
    }

    public Human(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", address='" + address + '\'' +
                ", name='" + super.getName() + '\'' +
                ", isMakeOrder=" + isMakeOrder +
                ", isTakeOrder=" + isTakeOrder +
                '}';
    }

    @Override
    public void setMakeOrder() {
        this.isMakeOrder = true;
        System.out.println(super.getName() + ": Сделал заказ");
    }

    @Override
    public void setTakeOrder() {
        this.isTakeOrder = true;
        System.out.println(super.getName() + ": Забрал заказ");
    }

    @Override
    public boolean isMakeOrder() {
        return this.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return this.isTakeOrder;
    }

}
