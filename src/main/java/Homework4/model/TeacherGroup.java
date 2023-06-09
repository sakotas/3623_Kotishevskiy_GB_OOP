package Homework4.model;

import Homework4.service.UserGroupIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeacherGroup implements Iterable<Teacher>{
    private final List<Teacher> teachersList;

    public TeacherGroup() {
        teachersList = new ArrayList<>();
    }


    public void add(Teacher teacher) {
        teachersList.add(teacher);
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new UserGroupIterator<>(teachersList);
    }
}
