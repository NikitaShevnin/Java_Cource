package SeminarOOP5_MVC.cw.user;

import SeminarOOP5_MVC.cw.controller.UserController;
import SeminarOOP5_MVC.cw.model.User;

import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();
        System.out.println("Введите данные пользователя: ");
        Scanner scanner = new Scanner(System.in);
        userController.saveNewUser(scanner.nextInt(), scanner.next(), scanner.nextInt());

        User user1 = new User(123, "Nick", 24);
        // вызываем всем методы обратоки юзера
        // добавление удаление и получение данных
        userController.addUserToRepo(user1);
        userController.getUser(user1);
        userController.deleteUserParam(user1);
        User user2 = new User(351, "Sam", 31);
        User user3 = new User(478, "john", 19);
    }
}
