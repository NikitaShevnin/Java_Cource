package SeminarOOP4.oseminar;

import SeminarOOP4.oseminar.controller.StudentController;
import SeminarOOP4.oseminar.data.Student;
import SeminarOOP4.oseminar.data.Teacher;
import SeminarOOP4.oseminar.data.UserComparator;
import SeminarOOP4.oseminar.service.TeacherService;
import SeminarOOP4.oseminar.view.StudentView;
import SeminarOOP4.oseminar.view.TeacherView;

import java.time.LocalDate;
import java.util.List;

/**
 * CW 2 ->
 * - Модифицировать ранее созданный класс ЮзерВью
 * - Сделать его интерфейсом
 * - Типизировать его T наследующегося от типа Юзер
 * - Внести в метод sendOnConsole типизацию
 * - Создать класс СтудентВью реализующий созданный интерфейс
 * - Внести правки в метод sendOnConsole согласно типизации
 * - Перенести в него ранее созданные другие методы(включая те, которые могли быть созданы в процессе
 * домашней работы)
 *----------------------------------------------
 * DZ Урок 4. ООП: Обобщения. ч1
 * Создать класс УчительСервис и реализовать аналогично проделанному на семинаре
 * Создать класс УчительВью и реализовать аналогично проделанному на семинаре
 */
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("student1_0", "student1_2", "student1_3", LocalDate.now());
        Student student2 = new Student("student2_0", "student2_2", "student2_3", LocalDate.now());
        UserComparator<Student> comparator = new UserComparator<>();
        System.out.println(comparator.compare(student1, student2));

        StudentView studentView = new StudentView();
        System.out.println(studentView.sendOnConsole(List.of(new Student("student3_0", "student3_2", "student3_3", LocalDate.now()))));

        TeacherService teacherService = new TeacherService();
        teacherService.create("teacher1_0", "teacher1_1", "teacher1_3", LocalDate.now()); //если нет такого добавить учителя

        TeacherView teacherView = new TeacherView();
        System.out.println(teacherView.sendOnConsole(List.of(new Teacher("teacher2_0", "teacher2_1", "teacher3_1", LocalDate.now()))));
    }
}
