package Homework4.controller;

import Homework4.model.User;

import java.util.List;

public interface UserController<T extends User> {
    void create(String fullName, Integer age, String phoneNumber);
    List<T> getAllSortUsers();
    List<T> getAllSortUsersByFamilyName();
    List<T> getAllSortUsersByAge();
    List<T> getAll();
    boolean removeUser(String fullName);


}
