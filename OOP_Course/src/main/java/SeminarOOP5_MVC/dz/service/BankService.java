package SeminarOOP5_MVC.dz.service;

import SeminarOOP5_MVC.dz.model.User;

/**
 * 1. Реализация методов депозит, вывод и вузализация баланса.
 */
public class BankService {
    public int getBalance (User user) {
        return user.getBalance();
    }
    public static void deposit(User user, int amount){

        RebalacingService.rebalancing(user, amount);
    }
    public static void withdraw(User user, int amount){

        RebalacingService.rebalancing(user, -amount);
    }
}
