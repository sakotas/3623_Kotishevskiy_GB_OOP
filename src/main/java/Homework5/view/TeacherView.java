package Homework5.view;

import Homework5.controller.TeacherController;
import Homework5.model.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher>{

    TeacherController teacherUserController;

    public TeacherView(TeacherController teacherUserController) {
        this.teacherUserController = teacherUserController;
    }
    @Override
    public void sendOnConsole(String sortType) {
        List<Teacher> teachers = switch (sortType) {
            case SortType.NONE -> teacherUserController.getAll();
            case SortType.NAME -> teacherUserController.getAllSortUsers();
            case SortType.FAMILY -> teacherUserController.getAllSortUsersByFamilyName();
            case SortType.AGE -> teacherUserController.getAllSortUsersByAge();
            case SortType.EXPERIENCE -> teacherUserController.getAllSortByExperience();
            default -> null;
        };
        if(teachers == null){
            System.out.println("Students is null");
            return;
        }
        System.out.println("=======УЧИТЕЛЯ=======");
        for (Teacher teacher: teachers) {
            System.out.println(teacher);

        }
        System.out.println("======================");

    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        teacherUserController.create(fullName, age, phoneNumber);
    }

    public void create(String fullName, Integer age, String phoneNumber, Integer experienceYears) {
        teacherUserController.create(fullName, age, phoneNumber, experienceYears);
    }

    @Override
    public void removeUser(String fullName) {

    }

    public Teacher getTeacherById(Long id){
        return teacherUserController.getTeacherById(id);
    }
}
