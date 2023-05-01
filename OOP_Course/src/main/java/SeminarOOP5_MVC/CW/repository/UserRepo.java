package SeminarOOP5_MVC.CW.repository;

import SeminarOOP5_MVC.CW.model.User;

import java.io.FileWriter;

/**
 * В этом классе "Сохраняем" юзера в нашу файловую систему.
 */
public class UserRepo {
    public void saveUser(User user) {
        try (FileWriter fileWriter = new FileWriter("text.txt")) {
            fileWriter.write(user.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}