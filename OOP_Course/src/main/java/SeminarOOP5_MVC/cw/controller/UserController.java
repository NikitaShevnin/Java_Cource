package SeminarOOP5_MVC.cw.controller;

import SeminarOOP5_MVC.cw.model.User;
import SeminarOOP5_MVC.cw.service.UserService;

public class UserController {
    UserService userService = new UserService();
    public void saveNewUser(int userID, String name, int age){
        userService.saveUser(new User(userID, name, age));
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
