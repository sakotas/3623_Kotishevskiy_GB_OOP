package Homework5.controller;

import Homework5.model.Teacher;
import Homework5.service.TeacherService;

import java.util.List;

public class TeacherController implements UserController<Teacher>{
    private TeacherService teacherUserService;
    public TeacherController(TeacherService teacherUserService) {
        this.teacherUserService = teacherUserService;
    }
    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        teacherUserService.create(fullName, age, phoneNumber);
    }

    public void create(String fullName, Integer age, String phoneNumber, Integer experienceYears){
        teacherUserService.create(fullName, age, phoneNumber, experienceYears);
    }

    @Override
    public List<Teacher> getAllSortUsers() {
        return teacherUserService.getAllSortUsers();
    }

    @Override
    public List<Teacher> getAllSortUsersByFamilyName() {
        return teacherUserService.getAllSortUsersByFamilyName();
    }

    @Override
    public List<Teacher> getAllSortUsersByAge() {
        return teacherUserService.getAllSortUsersByAge();
    }

    @Override
    public List<Teacher> getAll() {
        return teacherUserService.getAll();
    }

    @Override
    public boolean removeUser(String fullName) {
        teacherUserService.removeUser(fullName);
        return true;
    }

    public List<Teacher> getAllSortByExperience() {
        return teacherUserService.getAllSortByExperience();
    }

    public Teacher getTeacherById(Long id) {
        return teacherUserService.getTeacherById(id);
    }
}
