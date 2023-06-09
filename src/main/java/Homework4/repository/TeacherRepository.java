package Homework4.repository;

import Homework4.model.Student;
import Homework4.model.Teacher;
import Homework4.service.TeacherService;

import java.util.ArrayList;
import java.util.List;


public class TeacherRepository implements UserRepository<Teacher> {

    private static List<Teacher> teachers = null;

    public TeacherRepository() {
        teachers = new ArrayList<>();
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
            if(teacher.getId() > maxId) {
                maxId = teacher.getId();
            }
        }
        return maxId;
    }
}
