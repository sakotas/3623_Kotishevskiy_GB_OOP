package Homework5.service;

import Homework5.model.Teacher;
import Homework5.model.User;
import Homework5.repository.TeacherRepository;
import Homework5.repository.UserRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TeacherService implements UserService<Teacher> {

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        Long id = teacherRepository.getMaxId() + 1;
        Teacher teacher = new Teacher(id, fullName, age, phoneNumber);
        teacherRepository.add(teacher);
    }

    public void create(String fullName, Integer age, String phoneNumber, Integer experienceYears) {
        Long id = teacherRepository.getMaxId() + 1;
        Teacher teacher = new Teacher(id, fullName, age, phoneNumber, experienceYears);
        teacherRepository.add(teacher);
    }



    @Override
    public List getAll() {
        return teacherRepository.getAll();
    }

    @Override
    public List getAllSortUsers() {
        List<Teacher> teachers = teacherRepository.getAll();
        Collections.sort(teachers);
        return teachers;
    }

    @Override
    public List getAllSortUsersByFamilyName() {
        List<Teacher> teachers = teacherRepository.getAll();
        teachers.sort(new UserComparator<>());
        return teachers;
    }

    @Override
    public List getAllSortUsersByAge() {
        List<Teacher> teachers = teacherRepository.getAll();
        teachers.sort(Comparator.comparing(User::getAge));
        return teachers;
    }


    @Override
    public void removeUser(String fullName) {
        teacherRepository.remove(fullName);
    }

    public List<Teacher> getAllSortByExperience() {
        List<Teacher> teachers = teacherRepository.getAll();
        teachers.sort(Comparator.comparing(Teacher::getExperienceYears));
        return teachers;
    }

    public Teacher getTeacherById(Long id) {
        return teacherRepository.getTeacherById(id);
    }
}
