package Homework5.service;

import Homework5.model.StudentGroup;
import Homework5.model.StudyClass;
import Homework5.model.Teacher;

public class StudyClassService {

    private final StudyClass studyClass;


    public StudyClassService(StudyClass studyClass) {
        this.studyClass = studyClass;
    }

    public void create(Teacher teacher, StudentGroup studentGroup){
        this.studyClass.setTeacher(teacher);
        this.studyClass.setStudentGroup(studentGroup);
    }

    public StudyClass getStudyClass() {
        return studyClass;
    }

    public Teacher getTeacher(){
        return studyClass.getTeacher();
    }

    public StudentGroup getStudentGroup(){
        return studyClass.getStudentGroup();
    }

}
