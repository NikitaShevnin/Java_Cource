package SeminarOOP4.oseminar.view;

import SeminarOOP4.oseminar.data.Teacher;
import SeminarOOP4.oseminar.data.User;
import java.util.List;

/**
 * Учитель вью - это класс который выводит результат на консоль
 */

import java.util.List;

public class TeacherView implements UserView<Teacher> {
    @Override
    public Teacher sendOnConsole (List<User> userListlist) {
        return (Teacher) userListlist.get(0);
    }
}