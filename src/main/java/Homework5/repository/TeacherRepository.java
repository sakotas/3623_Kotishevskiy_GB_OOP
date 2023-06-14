package Homework5.repository;

import Homework5.model.Teacher;

import java.util.ArrayList;
import java.util.List;


public class TeacherRepository implements UserRepository<Teacher> {

    private static List<Teacher> teachers = null;

    public TeacherRepository() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void add(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public void remove(String fullName) {
        for (Teacher teacher : teachers) {
            if (teacher.getFullName().equals(fullName)) {
                teachers.remove(teacher);
                return;
            }

        }
    }

    @Override
    public Long getMaxId() {
        Long maxId = 0L;
        for (Teacher teacher : teachers) {
            if (teacher.getId() > maxId) {
                maxId = teacher.getId();
            }
        }
        return maxId;
    }

    public Teacher getTeacherById(Long id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id){
                return teacher;
            }
        }
        return null;
    }
}
