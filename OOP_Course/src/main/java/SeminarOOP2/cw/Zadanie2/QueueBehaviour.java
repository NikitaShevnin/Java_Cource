package SeminarOOP2.cw.Zadanie2;

import SeminarOOP2.cw.Zadanie1.Human;

/**
 * Интерфейс QueueBehaviour, который описывает логику
 *  * очереди – помещение в/освобождение из очереди,
 *  * принятие/отдача заказа
 */
public interface QueueBehaviour {
    public void takeInQueue(Human human); // принятие в очередь
    public void takeOrder (); // получение заказа
    public void giveOrders(); // выдача заказа
    public void releaseFromQueue(); // выход из очереди
}
