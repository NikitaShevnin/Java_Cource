package SeminarOOP5_MVC.CW.service;

import SeminarOOP5_MVC.CW.model.User;

import SeminarOOP5_MVC.CW.repository.UserRepo;
public class UserService {
    private UserRepo userRepo = new UserRepo();
    public void saveUser (User user){
        userRepo.saveUser(user);
    }

    public void deleteFromRepo(User user){
        userRepo.deleteFromRepo(user);
    }
    public User getUserData (User user){
        return userRepo.getUserData(user);
    }
    public void addUserToRepo (User user){
        userRepo.addUserToRepo(user);
    }
}
