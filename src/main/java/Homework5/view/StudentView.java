package Homework5.view;

import Homework5.controller.StudentController;
import Homework5.controller.UserController;
import Homework5.model.Student;
import Homework5.model.StudentGroup;

import java.util.List;

public class StudentView implements UserView<Student> {
    StudentController studentController;

    public StudentView(StudentController studentController) {
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

    public List<Student> getAll(){
        return studentController.getAll();
    }

}
