package SeminarOOP5_MVC.dz.service;

import SeminarOOP5_MVC.dz.model.User;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Функционал класса ->
 * 1. Формируется база данных в виде ArrayList
 * 2. описаны методы для добавления, удаления пользователей
 * 3. Описан метод для сохранения данных пользователя в текстовый файл
 */
public class BankDataBase {
    private List<User> BankDataBase = new ArrayList<>();
    public BankDataBase() {this.BankDataBase = new ArrayList<>();}

    /**
     * Метод для добавления пользователя
     * @param user
     */
    public void addUserToDB (User user){
        BankDataBase.add(user);
    }
    /**
     * Метод для удаления пользователя
     * @param user
     */
    public void deleteUserFromDB (User user){
        BankDataBase.remove(user);
    }
    /**
     * Метод который сохраняет данные пользователя в текстовый файл
     * под названием BankUserData.txt для дальнейшего использования
     * @param user
     */
    public void saveUser (User user) {
        try (FileWriter fileWriter = new FileWriter("BankUserData.txt")) {
            fileWriter.write(user.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
