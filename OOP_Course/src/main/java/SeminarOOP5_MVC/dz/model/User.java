package SeminarOOP5_MVC.dz.model;

/**
 * 1. Тут мы храним данные и поля (геттеры, сеттеры), передаем их в BankService.
 * 2. Описан метод изменения балланса "rebalancing"
 */
public class User {
    private String name;
    private int UserID;
    public int Balance;

    public User(String name, int userID, int balance) {
        this.name = name;
        UserID = userID;
        Balance = balance;
    }
    public void rebalancing (int amount){
        this.Balance += amount;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", UserID=" + UserID +
                ", Balance=" + Balance +
                '}';
    }
}
