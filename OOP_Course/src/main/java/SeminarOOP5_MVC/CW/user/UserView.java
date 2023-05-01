package SeminarOOP5_MVC.CW.user;

import SeminarOOP5_MVC.CW.controller.UserController;
import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();
        System.out.println("Введите данные пользователя: ");
        Scanner scanner = new Scanner(System.in);
        userController.saveNewUser(scanner.nextLine(), scanner.nextInt());
    }
}
