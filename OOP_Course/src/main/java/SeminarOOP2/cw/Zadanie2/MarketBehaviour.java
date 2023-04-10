package SeminarOOP2.cw.Zadanie2;

import SeminarOOP2.cw.Zadanie1.Human;

/**
 * описывает логику
 * магазина – приход/уход покупателей, обновление
 * состояния магазина
 */
public interface MarketBehaviour {
    public void acceptToMarket (Human human); // клиент приходит в магазин
    public void releaseFromMarket (Human human); // клиент уходит из магазина
    public void update();
}
