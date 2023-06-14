package Homework5;

import Homework5.controller.StudentController;
import Homework5.controller.StudyClassController;
import Homework5.controller.TeacherController;
import Homework5.model.Student;
import Homework5.model.StudentGroup;
import Homework5.model.StudyClass;
import Homework5.model.Teacher;
import Homework5.repository.StudentRepository;
import Homework5.repository.TeacherRepository;
import Homework5.service.StudentService;
import Homework5.service.StudyClassService;
import Homework5.service.TeacherService;
import Homework5.view.SortType;
import Homework5.view.StudentView;
import Homework5.view.StudyClassView;
import Homework5.view.TeacherView;

import java.util.Random;

// Домашнее задание 4:
//— Создать класс УчительСервис и реализовать аналогично проделанному на семинаре;
//— Создать класс УчительВью и реализовать аналогично проделанному на семинаре;
//— Создать класс УчительКонтроллер и реализовать возможность создания, редактирования
// конкретного учителя и отображения списка учителей, имеющихся в системе.

//Домашнее задание 5:
//— Создать класс УчебнаяГруппа, содержащий в себе поля Преподаватель и список Студентов;
//— Создать класс УчебнаяГруппаСервис, в котором реализована функция (входные параметры -
// (Teacher, List<Strudent>)) формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его;
//— Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id)
// и преподавателя (его id) и формирования учебной группы, путём вызова метода из сервиса;
//— Всё вышеуказанное создать согласно принципам ООП, пройдённым на семинаре.


public class Program {

    public static void main(String[] args) {
//        СЕМИНАР 4
        StudentView studentView = getStudentView();

        studentView.create("Алексей Иванов", 19, "000");
        studentView.create("Александр Иванов", 20, "000");
        studentView.create("Александр Писькин", 30, "000");
        studentView.create("Светлана Лобощук", 29, "000");
        studentView.create("Ирина Кукуня", 150, "000");

        System.out.println("\n----Сортировка по имени:");
        studentView.sendOnConsole(SortType.NAME);
        System.out.println("\n----Сортировка по возрасту:");
        studentView.sendOnConsole(SortType.AGE);
//        ДОМАШНЕЕ ЗАДАНИЕ 4
        TeacherView teacherView = getTeacherView();

        teacherView.create("Евлампий Анатолько", 67, "000");
        teacherView.create("Альбина Снежная", 98, "111", 100);
        teacherView.create("Сукон Яколвлев", 18, "111", 120);
        teacherView.create("Сыкрывкара Кошка", 26, "111", 10);
        teacherView.create("Евграфо Анатолько", 68, "000");

        System.out.println("\n----Сортировка по имени:");
        teacherView.sendOnConsole(SortType.NAME);
        System.out.println("\n----Сортировка по возрасту:");
        teacherView.sendOnConsole(SortType.AGE);
        System.out.println("\n----Сортировка по опыту:");
        teacherView.sendOnConsole(SortType.EXPERIENCE);

        StudyClassView studyClassView = getStudyClassView();

        studyClassView.showStudyClass();



    }

    private static StudentView getStudentView() {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
        return new StudentView(controller);
    }

    private static TeacherView getTeacherView() {
        TeacherRepository repository = new TeacherRepository();
        TeacherService service = new TeacherService(repository);
        TeacherController controller = new TeacherController(service);
        return new TeacherView(controller);
    }

    private static StudyClassView getStudyClassView() {
        Teacher teacher = new Teacher(1L, "Teacher_1", 50, "999", 20);
        StudyClass studyClass = new StudyClass(teacher, StudentGroup.generateStudentGroup());
        StudyClassService service = new StudyClassService(studyClass);
        StudyClassController controller = new StudyClassController(service);
        return new StudyClassView (controller);
    }

}
