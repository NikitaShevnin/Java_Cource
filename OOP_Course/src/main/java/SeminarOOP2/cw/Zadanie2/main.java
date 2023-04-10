package SeminarOOP2.cw.Zadanie2;

import SeminarOOP2.cw.Zadanie1.Human;

/**
 * Вызов всех методов, компиляция
 */
public class main {
    public static void main(String[] args) {
        Human human = new Human();
        Market magaz = new Market();
        magaz.acceptToMarket(human);
        magaz.takeInQueue(human);
        magaz.takeOrder();
        magaz.giveOrders();
        magaz.releaseFromMarket(human);
        magaz.releaseFromQueue();
    }
}
