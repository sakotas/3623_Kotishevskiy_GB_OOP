package Homework4;

import Homework4.controller.StudentController;
import Homework4.model.Student;
import Homework4.model.StudentGroup;
import Homework4.repository.StudentRepository;
import Homework4.service.StudentService;
import Homework4.view.SortType;
import Homework4.view.StudentView;
import Homework4.view.UserView;

public class Program {

    public static void main(String[] args) {
        StudentView view = getStudentView();

        view.sendOnConsole(SortType.NAME);

        view.create("Алексей Иванов", 19, "000");
        view.create("Александр Иванов", 20, "000");
        view.create("Александр Писькин", 30, "000");
        view.create("Светлана Лобощук", 29, "000");
        view.create("Ирина Кукуня", 150, "000");

        view.sendOnConsole(SortType.NAME);
        view.sendOnConsole(SortType.AGE);

    }

    private static StudentView getStudentView() {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
        return new StudentView(controller);
    }

}
