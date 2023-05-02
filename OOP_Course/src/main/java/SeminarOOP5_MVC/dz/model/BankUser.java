package SeminarOOP5_MVC.dz.model;

/**
 * Тут мы храним данные и поля
 */
public class BankUser {
    private int UserName;
    private int Balance;
    private String name;

    public BankUser(int userName, int balance, String name) {
        UserName = userName;
        Balance = balance;
        this.name = name;
    }

    public int getUserName() {
        return UserName;
    }

    public void setUserName(int userName) {
        UserName = userName;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BankUser{" +
                "UserName=" + UserName +
                ", Balance=" + Balance +
                ", name='" + name + '\'' +
                '}';
    }
}
