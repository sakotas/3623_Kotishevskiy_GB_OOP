package Homework5.model;

import Homework5.service.UserGroupIterator;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Getter
@ToString
//@Data
public class StudentGroup implements Iterable<Student> {

    private List<Student> studentsList;

    public static StudentGroup generateStudentGroup(){
        StudentGroup studentGroup = new StudentGroup();
        for (Integer i = 1; i < 11; i++) {
            Long id = i.longValue();
            studentGroup.add(
                    new Student(
                            id,
                            String.format("Student_" + i),
                            new Random().nextInt(18, 25),
                            String.format("" + new Random().nextInt(1111, 9999))));
        }
        return studentGroup;
    }

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

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }


}
