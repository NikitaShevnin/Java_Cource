package SeminarOOP6_SOLID.hw_refactoring4sem.view;

import SeminarOOP4.oseminar.data.Teacher;
import SeminarOOP4.oseminar.data.User;

import java.util.List;


public class TeacherView implements UserView<Teacher> {

    @Override
    public Teacher sendOnConsole(List<User> userListlist) {
        return (Teacher) userListlist.get(0);
    }


}