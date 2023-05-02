package SeminarOOP5_MVC.CW.controller;

import SeminarOOP5_MVC.CW.model.User;
import SeminarOOP5_MVC.CW.service.UserService;

public class UserController {
    UserService userService = new UserService();
    public void saveNewUser(int userID, String name, int age){
        userService.saveUser(new User(userID, name, age)); // (!) по дугому написанно просто поставили значение ID 1
    }
    public void deleteUserParam(User user){
        userService.deleteFromRepo(user);
    }
    public User getUser(User user){ // описана логика вывода на консоль
        return userService.getUserData(user);
    }
    public void addUserToRepo (User user){
        userService.addUserToRepo(user);
    }
}
