package SeminarOOP5_MVC.CW.service;

import SeminarOOP5_MVC.CW.model.User;

import SeminarOOP5_MVC.CW.repository.UserRepo;
public class UserService {
    private UserRepo userRepo = new UserRepo();
    public void saveUser (User user){
        userRepo.saveUser(user);
    }
}
