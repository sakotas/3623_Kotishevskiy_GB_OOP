package Homework5.model;

import lombok.*;

@Getter
//@AllArgsConstructor
//@Setter
//@ToString
@EqualsAndHashCode(callSuper = true)
//@Data
//@ToString
public class Student extends User implements Comparable<Student> {

    private Double gpa;
    private String advisor;

    public Student(Long id, String fullName, Integer age, String phoneNumber) {
        super(id, fullName, age, phoneNumber);
    }

    @Override
    public int compareTo(Student o) {
        return getFullName().compareTo(o.getFullName());
    }

    @Override
    public String toString() {
        return String.format("id: %s, ФИО: %s, Возраст: %s", this.getId(), this.getFullName(), this.getAge());
    }
}

