package Homework5.controller;

import Homework5.model.StudentGroup;
import Homework5.model.StudyClass;
import Homework5.model.Teacher;
import Homework5.service.StudyClassService;

public class StudyClassController {

    public StudyClassService studyClassService;

    public StudyClassController(StudyClassService studyClassService) {
        this.studyClassService = studyClassService;
    }

    public void create(Teacher teacher, StudentGroup studentGroup){
        studyClassService.create(teacher, studentGroup);
    }

    public StudyClass getStudyClass(){
        return studyClassService.getStudyClass();
    }

    public Teacher getTeacher() {
        return studyClassService.getTeacher();
    }

    public StudentGroup getStudentGroup() {
        return studyClassService.getStudentGroup();
    }
}
