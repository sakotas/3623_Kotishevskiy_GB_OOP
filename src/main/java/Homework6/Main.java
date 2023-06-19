package Homework6;

import Homework6.Work3.Greeter;
import Homework6.Work3.formalityType;
import Homework6.work1.AbstractFigure;
import Homework6.work1.Rectangle;
import Homework6.work1.Square;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        // Создал абстрактный класс для всех фигур с параметром height
        // Классы Rectangle и Square наследуются от от класса AbstractFigure
        // Класс Rectangle расширяет интерфейс Width, потому что в фигурах он имеет еще и ширину
        // Создал интерфейс width для фигур у которых будет дополнительно это параметр
        // реализация в пакете work1
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(15);
        System.out.println(rectangle);
        System.out.println(rectangle.calculateArea());

        Square square = new Square();
        square.setHeight(20);
        System.out.println(square);
        System.out.println(square.calculateArea());

        // Задание 2
        // Интерфес ReportGenerator "расшил" на два отдельных интерфейса:
        // ReportJsonGenerator и ReportXMLGenerator
        // В класс DocumentReportJsonGenerator.java имплементировал оба новых интерфейса
        // В класс AccountReportJsonGenerator.java имплементировал только ReportJsonGenerator
        // реализация в пакете work2

        // Задание 3
        // Добавил интерфейс formalityType для стандартизации вводных
        // Добавил конструктор со значением по умолчанию для класса Greeter
        // Реализация в пакете Work3

        Greeter greeter = new Greeter();
        System.out.println(greeter.greet());
        greeter.setFormality(formalityType.CASUAL);
        System.out.println(greeter.greet());
        greeter.setFormality(formalityType.FORMAL);
        System.out.println(greeter.greet());
        greeter.setFormality(formalityType.INTIMATE);
        System.out.println(greeter.greet());


    }
}