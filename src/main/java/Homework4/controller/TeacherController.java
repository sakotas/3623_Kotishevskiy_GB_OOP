package Homework4.controller;

import Homework4.model.Teacher;
import Homework4.service.TeacherService;
import Homework4.service.UserService;

import java.util.List;

public class TeacherController implements UserController<Teacher>{
    public TeacherService teacherUserService;
    public TeacherController(TeacherService teacherUserService) {
        this.teacherUserService = teacherUserService;
    }
    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        teacherUserService.create(fullName, age, phoneNumber);
    }

    public void createWithExperience(String fullName, Integer age, String phoneNumber, Integer experienceYears){
        teacherUserService.createWithExperience(fullName, age, phoneNumber, experienceYears);
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
}
