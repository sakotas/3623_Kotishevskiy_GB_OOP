package Homework4.view;

import Homework4.controller.StudentController;
import Homework4.controller.UserController;
import Homework4.model.Student;

import java.util.List;

public class StudentView implements UserView<Student> {
    UserController<Student> studentController;

    public StudentView(UserController<Student> studentController) {
        this.studentController = studentController;
    }

    @Override
    public void sendOnConsole(String sortType) {
        List<Student> students = switch (sortType) {
            case SortType.NONE -> studentController.getAll();
            case SortType.NAME -> studentController.getAllSortUsers();
            case SortType.FAMILY -> studentController.getAllSortUsersByFamilyName();
            case SortType.AGE -> studentController.getAllSortUsersByAge();
            default -> null;
        };
        if(students == null){
            System.out.println("Students is null");
            return;
        }
        System.out.println("=======СТУДЕНТЫ=======");
        for (Student student: students) {
            System.out.println(student);

        }
        System.out.println("======================");
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        studentController.create(fullName, age, phoneNumber);
    }

    @Override
    public void removeUser(String fullName) {
        studentController.removeUser(fullName);
    }
}
