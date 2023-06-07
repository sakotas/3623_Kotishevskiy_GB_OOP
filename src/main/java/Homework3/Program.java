package Homework3;

public class Program {

    public static void main(String[] args) {
        StudentGroup group = new StudentGroup();
        StudentRepository repository = new StudentRepository(group);
        StudentGroupService service = new StudentGroupService(repository);
        StudentController controller = new StudentController(service);

        System.out.println("-----------------");
        System.out.println("Список без сортировки:");
        controller.addStudent(new Student(4L, "Алексей Иванов", 19));
        controller.addStudent(new Student(6L, "Александр Иванов", 20));
        controller.addStudent(new Student(2L, "Александр Писькин", 30));
        controller.addStudent(new Student(1L, "Светлана Лобощук", 29));
        controller.addStudent(new Student(8L, "Ирина Кукуня", 150));
        controller.printAll();

        System.out.println("-----------------");
        System.out.println("Сортировка по возрасту:");
        controller.sortByAge();
        controller.printAll();

        System.out.println("-----------------");
        System.out.println("Сортировка по имени:");
        controller.sortByFirstName();
        controller.printAll();

        System.out.println("-----------------");
        System.out.println("Сортировка по фамилии:");
        controller.sortByLastName();
        controller.printAll();

        controller.deleteStudent("Ирина Кукуня");
        System.out.println("-----------------");
        System.out.println("--УДАЛЯЕМ ИРИНУ--");
        System.out.println("-----------------");
        controller.printAll();

    }

}
