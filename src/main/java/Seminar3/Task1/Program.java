package Seminar3.Task1;

import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Personnel personnel = new Personnel();
        User user1 = new User("Alex", "Ivanov", 40);
        User user2 = new User("Ivan", "Petrov", 32);
        User user3 = new User("Semen", "Slepakov", 100);
        User user4 = new User("Alex", "Alexandrov", 18);
        User user5 = new User("Alex", "Alexandrov", 15);

        personnel.addUser(user1);
        personnel.addUser(user2);
        personnel.addUser(user3);
        personnel.addUser(user4);
        personnel.addUser(user5);

        for (User user : personnel) {
            System.out.println(user);
        }

        System.out.println("-------------");
        List<User> userList = personnel.toList();
//        System.out.println(userList);

        Collections.sort(userList);
        for (User user : userList) {
            System.out.println(user);
        }

        System.out.println("-------------");
        Personnel personnel2 = new Personnel();
        personnel2.addUser(new User("Aleksey", "Ivanov", 80));
        personnel2.addUser(new User("Aleksey", "Petrov", 18));
        personnel2.addUser(new User("Aleksandr", "Piskin", 20));
        personnel2.addUser(new User("Irina", "Kukukunya", 15));
        personnel2.addUser(new User("Svetlana", "Loboschuk", 35));

        User newUser = new User("Lena", "Poleno", 20);
        newUser.setSubordinates(personnel);
        personnel2.addUser(newUser);
        User boss = new User("Big", "Boss", 150);
        boss.setSubordinates(personnel2);

        for (User user : personnel2) {
            System.out.println(user);
        }
        System.out.println("-------------");

        Company company = new Company(boss);

        for (User item: company) {
            System.out.println(item);
        }



    }
}
