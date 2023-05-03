package SeminarOOP5_MVC.cw.service;

import SeminarOOP5_MVC.cw.model.User;

import SeminarOOP5_MVC.cw.repository.UserRepo;
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
