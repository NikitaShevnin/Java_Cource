package SeminarOOP5_MVC.dz.view;

import SeminarOOP5_MVC.dz.model.User;
import SeminarOOP5_MVC.dz.service.BankService;

/**
 * через switch case описать меню действий для пользователя
 * цифра 1 пополнение
 * цифра 2 вывод
 * цифра 3 показать данные пользователья и балланс счета
 * Передаем этот метод в Main для компиляции
 */
public class BankView {
    /**
     * Метод вывода на экран о проделанный операции
     * пополнеия или снятия средств со счета
     */
    public static void transactionView (int amount){
        if (amount > 0){
            System.out.print("На ваш банковский счет внесена сумма: " + amount);
        } else if (amount < 0) {
            System.out.print("С вашего счета снята сумма: " + amount);
        }
    }
    private void showUserMenu(){
        System.out.println("Выберите дейсвтвие: ");
        System.out.println("1 - Вывод балланса на экран. ");
        System.out.println("2 - Депозит. ");
        System.out.println("3 - Вывод средств. ");
    }
    private void userMenu (int userAction){
        switch (userAction){
            case 1 -> BankService.getBalance;
            case 2 -> BankService.deposit();
            case 3 -> BankService.withdraw();
        }
    }
}
