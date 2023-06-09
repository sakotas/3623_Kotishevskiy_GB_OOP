package Homework4.model;

import Homework4.service.UserGroupIterator;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
@ToString
//@Data
public class StudentGroup implements Iterable<Student> {

    private final List<Student> studentsList;

    public StudentGroup() {
        studentsList = new ArrayList<>();
    }

    @Override
    public Iterator<Student> iterator() {
        return new UserGroupIterator<>(studentsList);
    }

    public void add(Student student) {
        studentsList.add(student);
    }
}
