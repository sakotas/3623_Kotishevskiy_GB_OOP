package Seminar21;

import Seminar2.Human;

public class Program {

    public static void main(String[] args) {
        Human client1 = new Human("Вася", "М", 28, "Russia");
        Human client2 = new Human("Изабелла");
        Market market = new Market();

        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        System.out.println(market.getMarketQueue());
        client1.setMakeOrder();
        System.out.println(market.getMarketQueue());


    }
}
