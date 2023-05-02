package SeminarOOP5_MVC.ExSolution.service;

import SeminarOOP5_MVC.ExSolution.model.User;
import SeminarOOP5_MVC.ExSolution.view.Messages;

public class UserService {
    public User createUser(int id, String name){
        return new User(id,name);
    }
    public void changeBalance(User user, int amount){
        user.changeBalance(amount);
        Messages.ShowOperation(amount);
    }
}