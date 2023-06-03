package Seminar2;

public class Program {
    public static void main(String[] args) {
        Human h1 = new Human("Саня");
        Human h2 = new Human("Санёк", "М", 18, "Москва");

        System.out.println(h1);
        System.out.println(h2);
        h2.setMakeOrder();
        System.out.println(h2);
        h2.setTakeOrder();
        System.out.println(h2);

        Dog d1 = new Dog("Шарик", "М");
        d1.setMakeOrder();
        d1.setTakeOrder();
        System.out.println(d1);
        System.out.println(h2.getSex());
    }
}
