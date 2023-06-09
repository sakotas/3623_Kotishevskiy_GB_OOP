package Homework4;

import Homework4.controller.StudentController;
import Homework4.controller.TeacherController;
import Homework4.model.Student;
import Homework4.model.StudentGroup;
import Homework4.repository.StudentRepository;
import Homework4.repository.TeacherRepository;
import Homework4.service.StudentService;
import Homework4.service.TeacherService;
import Homework4.view.SortType;
import Homework4.view.StudentView;
import Homework4.view.TeacherView;
import Homework4.view.UserView;

import static Homework4.view.SortType.EXPERIENCE;

// Домашнее задание:
//— Создать класс УчительСервис и реализовать аналогично проделанному на семинаре;
//— Создать класс УчительВью и реализовать аналогично проделанному на семинаре;
//— Создать класс УчительКонтроллер и реализовать возможность создания, редактирования
// конкретного учителя и отображения списка учителей, имеющихся в системе.

public class Program {

    public static void main(String[] args) {
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

        TeacherView teacherView = getTeacherView();

        teacherView.create("Евлампий Анатолько", 67, "000");
        teacherView.createWithExperience("Альбина Снежная", 98, "111", 100);
        teacherView.createWithExperience("Сукон Яколвлев", 18, "111", 120);
        teacherView.createWithExperience("Сыкрывкара Кошка", 26, "111", 10);
        teacherView.create("Евграфо Анатолько", 68, "000");

        System.out.println("\n----Сортировка по имени:");
        teacherView.sendOnConsole(SortType.NAME);
        System.out.println("\n----Сортировка по возрасту:");
        teacherView.sendOnConsole(SortType.AGE);
        System.out.println("\n----Сортировка по опыту:");
        teacherView.sendOnConsole(SortType.EXPERIENCE);

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

}
