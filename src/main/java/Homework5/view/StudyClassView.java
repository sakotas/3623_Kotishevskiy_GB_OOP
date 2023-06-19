package Homework5.view;

import Homework5.controller.StudyClassController;
import Homework5.model.Student;
import Homework5.model.StudentGroup;
import Homework5.model.Teacher;

public class StudyClassView {
    StudyClassController studyClassController;

    public StudyClassView(StudyClassController studyClassController) {
        this.studyClassController = studyClassController;
    }

    public void create(Teacher teacher, StudentGroup studentGroup){
        this.studyClassController.create(teacher, studentGroup);
    }


    public void showStudyClass(){
        System.out.println("==============================");
        System.out.println("=======ПРЕПОДАВАТЕЛЬ:=========");
        System.out.println(studyClassController.getTeacher());
        System.out.println("==========СТУДЕНТЫ:===========");
        for (Student student : studyClassController.getStudentGroup()) {
            System.out.println(String.format("    " + student));
        }
        System.out.println("==============================");


    }

}
