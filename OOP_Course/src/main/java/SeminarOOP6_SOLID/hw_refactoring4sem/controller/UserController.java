package SeminarOOP6_SOLID.hw_refactoring4sem.controller;

import SeminarOOP4.oseminar.data.User;

import java.time.LocalDate;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}