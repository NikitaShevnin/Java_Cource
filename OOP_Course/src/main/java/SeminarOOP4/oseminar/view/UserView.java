package SeminarOOP4.oseminar.view;

import SeminarOOP4.oseminar.data.Student;
import SeminarOOP4.oseminar.data.User;

import java.util.List;

public interface UserView<T extends User>{

    T sendOnConsole(List<User> userListlist);
}
