package SeminarOOP5_MVC.ExSolution2Bank;

import java.util.Date;
public interface SavingsAccount {
    void deposit(double amount, Date date);

    void withdraw(double amount, Date date);
}
