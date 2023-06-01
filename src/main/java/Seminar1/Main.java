package Seminar1;

public class Main {
    public static void main(String[] args) {
        //  Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
        //  содержащий в себе методы initProducts (List <Product>)
        //  сохраняющий в себе список исходных продуктов и findProduct(String name)

        //  Сделать класс Товар абстрактным, создать нескольких наследников
        //  (к примеру: БутылкаВоды), сделать интерфейсом ТорговыйАвтомат и
        //  реализовать класс какого-то одного типа ТорговогоАвтомата
        //  (пример: ПродающийБутылкиВодыАвтомат)

        //    1. Попросить вначале переопределить метод toString для Товара,
        //    запустить программу, после этого переопределить для наследника
        //    этот метод, после запуска обратить внимание на изменение поведения.

        //    2. Попросить создать перегруженный метод выдачи товара
        //    ТорговымАвтоматом дополнив дополнительным входным параметром
        //    (пример: getProduct(String name) выдающий товар по имени,
        //    создать метод возвращающий товар по имени и какому-либо параметру
        //    товара getProduct(String name, int volume)

        Vending VendingMachine = new FruitVending();
        VendingMachine.addProduct(new Sausage("Сосика", 2.99, 1L));
        VendingMachine.addProduct(new Dumpkin("Пельмень", 1.99, 2L));
        VendingMachine.addProduct(new Cheburek("Чебурек", 3.99, 3L));

        System.out.println(VendingMachine.findProduct("Сосика"));
        System.out.println(VendingMachine.findProduct("Пельмень"));
        System.out.println(VendingMachine.findProduct("Чебурек"));
        System.out.println(VendingMachine.findProduct(1L));
        System.out.println(VendingMachine.findProduct(2L));

    }

}
