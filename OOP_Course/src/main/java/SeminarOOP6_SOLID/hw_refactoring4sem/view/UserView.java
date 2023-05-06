package SeminarOOP6_SOLID.hw_refactoring4sem.view;

import SeminarOOP4.oseminar.data.User;

import java.util.List;

public interface UserView<T extends User>{
    T sendOnConsole(List<User> userListlist);
}