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

        // ДЗ
        // 1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
        // 2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и
        // реализовать перегруженный метод getProduct(int name, int volume, int temperature),
        // выдающий продукт соответствующий имени, объёму и температуре
        // 3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику,
        // заложенную в программе
        // 4. Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

        Vending fruitVending = new FruitVending();
        fruitVending.addProduct(new Sausage("Сосика", 2.99, 1L));
        fruitVending.addProduct(new Dumpkin("Пельмень", 1.99, 2L));
        fruitVending.addProduct(new Cheburek("Чебурек", 3.99, 3L));

        HotDrinkVending drinkVending = new HotDrinkVending();
        drinkVending.addProduct(new HotDrink("Молоко", 3.99, 3L, 90));
        drinkVending.addProduct(new HotDrink("Кофе", 4.99, 4L, 85));
        drinkVending.addProduct(new HotDrink("Чай", 2.99, 5L, 100));

        System.out.println("----ФРУКТЫ----");
        System.out.println("----Поиск по названию----");
        System.out.println(fruitVending.findProduct("Сосика"));
        System.out.println(fruitVending.findProduct("Пельмень"));
        System.out.println(fruitVending.findProduct("Чебурек"));
        System.out.println("----Поиск по id----");
        System.out.println(fruitVending.findProduct(1L));
        System.out.println(fruitVending.findProduct(2L));
        System.out.println();
        System.out.println("----Горячие напитки----");
        System.out.println("----Поиск по названию----");
        System.out.println(drinkVending.findProduct("Кофе"));
        System.out.println(drinkVending.findProduct("Молоко"));
        System.out.println(drinkVending.findProduct("Чай"));
        System.out.println("----Поиск по id----");
        System.out.println(drinkVending.findProduct(3L));
        System.out.println(drinkVending.findProduct(4L));
        System.out.println("----Поиск по температуре----");
        System.out.println(drinkVending.findProductByTemp(90));


    }

}
