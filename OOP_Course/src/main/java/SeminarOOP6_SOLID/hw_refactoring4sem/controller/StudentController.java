package SeminarOOP6_SOLID.hw_refactoring4sem.controller;

import SeminarOOP4.oseminar.data.Student;
import SeminarOOP4.oseminar.data.Teacher;
import SeminarOOP4.oseminar.service.StudentGroupService;
import SeminarOOP4.oseminar.service.StudentService;
import SeminarOOP4.oseminar.view.StudentView;

import java.time.LocalDate;
import java.util.List;

public class StudentController implements UserController<Student>{

    private final StudentService dataService = new StudentService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView studentView = new StudentView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
//        List<Student> studentList = dataService.getAll();
//        studentView.sendOnConsole(studentList);
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);

    }

    public Student getStudentInStudentGroup(String firstName, String secondName){
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);

    }

    public List<Student> getSortedListStudentFromStudentGroup(){
        return studentGroupService.getSortedStudentGroup();

    }

    public List<Student> getSortedListByFIOStudentFromStudentGroup(){
        return studentGroupService.getSortedByFIOStudentGroup();

    }
}