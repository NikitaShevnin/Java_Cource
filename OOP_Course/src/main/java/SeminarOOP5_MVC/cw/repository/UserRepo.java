package SeminarOOP5_MVC.cw.repository;

import SeminarOOP5_MVC.cw.model.User;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * В этом классе "Сохраняем" юзера в нашу файловую систему.
 */
public class UserRepo {
    private List<User> dataBase = new ArrayList<>();

    public UserRepo() {
        this.dataBase = new ArrayList<>();
    }

    public void addUserToRepo (User user){
        dataBase.add(user);
    }
    public void deleteFromRepo (User user){
        dataBase.remove(user);
    }
    public User getUserData (User user){
        for (User el : dataBase){
            if (el.getUserID().equals(user.getUserID())){
                return el;
            }
        }
        return null;
    }
    public void saveUser(User user) {
        try (FileWriter fileWriter = new FileWriter("text.txt")) {
            fileWriter.write(user.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}