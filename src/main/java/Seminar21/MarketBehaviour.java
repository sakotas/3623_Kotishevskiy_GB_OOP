package Seminar21;

import Seminar2.Actor;

import java.util.List;

public interface MarketBehaviour {
    /**
     * Добавляем в очередь клиента
     * @param actor
     */
    void acceptToMarket(Actor actor);

    /**
     * Чувак выходит из магаза
     * @param actors
     */
    void releaseFromMarket(List<Actor> actors);
    void update();

}
