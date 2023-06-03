package Seminar2;

public class Dog extends Actor {

    public Dog(String name, String sex) {
        super(name, sex);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setMakeOrder() {
        System.out.println("Это пёс, он не умеет делать заказ");
    }

    @Override
    public void setTakeOrder() {
        System.out.println("Это пёс, он не умеет платить, как ты ему что-то продашь");

    }

    @Override
    public boolean isMakeOrder() {
        return this.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return this.isTakeOrder;
    }

    @Override
    public String toString() {
        return String.format("Пёс %s всего лишь пёс и не умеет делать заказы", super.getName());
    }
}
