package Seminar21;

import Seminar2.Actor;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour{

    private final List<Actor> MarketQueue;

    public Market() {
        MarketQueue = new ArrayList<>();
    }

    public List<Actor> getMarketQueue() {
        return MarketQueue;
    }

    @Override
    public void acceptToMarket(Actor actor) {
        this.MarketQueue.add(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {

    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Actor actor) {

    }

    @Override
    public void takeOrders() {

    }

    @Override
    public void giveOrders() {

    }

    @Override
    public void releaseFromQueue() {

    }
}
