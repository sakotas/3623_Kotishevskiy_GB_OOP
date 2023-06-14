package Homework5.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
//@AllArgsConstructor
//@Setter
//@ToString
@EqualsAndHashCode(callSuper = true)
//@Data
//@ToString

public class Teacher extends User implements Comparable<Teacher> {

    private Integer experienceYears = 0;
    private String comment;

    public Integer getExperienceYears() {
        return experienceYears;
    }

    public Teacher(Long id, String fullName, Integer age, String phoneNumber) {
        super(id, fullName, age, phoneNumber);
    }

    public Teacher(Long id, String fullName, Integer age, String phoneNumber, Integer experienceYears) {
        super(id, fullName, age, phoneNumber);
        this.experienceYears = experienceYears;
    }

    @Override
    public int compareTo(Teacher teacher) {
        return getFullName().compareTo(teacher.getFullName());
    }

    @Override
    public String toString() {
        return String.format("id: %s, ФИО: %s, Возраст: %s, Стаж: %s",
                this.getId(), this.getFullName(), this.getAge(), this.getExperienceYears());
    }

}
