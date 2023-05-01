package SeminarOOP5_MVC.CW.controller;

import SeminarOOP5_MVC.CW.model.User;
import SeminarOOP5_MVC.CW.service.UserService;

public class UserController {
    UserService userService = new UserService();
    public void saveNewUser(String name, int age){
        userService.saveUser(new User(name, age));
    }
}
