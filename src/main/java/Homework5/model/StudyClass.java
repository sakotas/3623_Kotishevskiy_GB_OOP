package Homework5.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudyClass {
    private Teacher teacher;
    private StudentGroup studentGroup;

    public StudyClass(Teacher teacher, StudentGroup studentGroup) {
        this.teacher = teacher;
        this.studentGroup = studentGroup;
    }

    @Override
    public String toString() {
        return "StudyClass{" +
                "teacher=" + teacher +
                ", studentGroup=" + studentGroup +
                '}';
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }
}
