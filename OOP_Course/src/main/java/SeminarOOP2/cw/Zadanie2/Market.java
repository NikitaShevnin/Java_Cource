package SeminarOOP2.cw.Zadanie2;

import SeminarOOP2.cw.Zadanie1.Human;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 1. Интерфейс QueueBehaviour, который описывает логику
 * очереди – помещение в/освобождение из очереди,
 * принятие/отдача заказа
 * 2. Интерфейс MarketBehaviour, который описывает логику
 * магазина – приход/уход покупателей, обновление состояния
 * магазина
 * 3. Класс Market, который реализовывает два вышеуказанных
 * интерфейса и хранит в списке список людей в очереди в
 * различных статусах
 */

public class Market implements QueueBehaviour, MarketBehaviour {
    List<Human> myList1 = new ArrayList<>();
    Queue<Human> muList2 = new LinkedList<>();

    @Override
    public void acceptToMarket(Human human) {

    }

    @Override
    public void releaseFromMarket(Human human) {

    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Human human) {

    }

    @Override
    public void takeOrder() {

    }

    @Override
    public void giveOrders() {

    }

    @Override
    public void releaseFromQueue() {

    }
}
