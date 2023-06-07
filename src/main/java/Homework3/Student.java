package Homework3;

import lombok.Data;

//@Getter
//@AllArgsConstructor
//@Setter
//@ToString
//@EqualsAndHashCode
@Data
public class Student implements Comparable<Student> {

    private final Long id;
    private final String fullName;
    private final int age;

    @Override
    public int compareTo(Student o) {
        return fullName.compareTo(o.fullName);
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("id: %s, ФИО: %s, Возраст: %s", this.id, this.fullName, this.age);
    }
}

