package Homework5.controller;

import Homework5.model.Student;
import Homework5.model.StudentGroup;
import Homework5.service.StudentService;
import Homework5.service.UserService;

import java.util.List;

public class StudentController implements UserController<Student>{

    public StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        studentService.create(fullName, age, phoneNumber);

    }

    @Override
    public List<Student> getAllSortUsers() {
        return studentService.getAllSortUsers();
    }

    @Override
    public List<Student> getAllSortUsersByFamilyName() {
        return studentService.getAllSortUsersByFamilyName();
    }

    @Override
    public List<Student> getAllSortUsersByAge() {
        return studentService.getAllSortUsersByAge();
    }

    @Override
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @Override
    public boolean removeUser(String fullName) {
        studentService.removeUser(fullName);
        return true;
    }

}
