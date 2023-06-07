package Seminar3.Task1;

public class User implements Comparable<User> {
    private String firstName;
    private String secondName;
    private int age;
    private Personnel subordinates;

    public Personnel getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(Personnel subordinates) {
        this.subordinates = subordinates;
    }

    public User(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + this.getFirstName() + '\'' +
                ", secondName='" + this.getSecondName() + '\'' +
                ", age=" + this.getAge() +
                '}';
    }


    @Override
    public int compareTo(User user) {
        int firstNameCompare = this.firstName.compareTo(user.getFirstName());
        if (firstNameCompare != 0) return firstNameCompare;
        int secondNameCompare = this.secondName.compareTo(user.getSecondName());
        if (secondNameCompare != 0) return secondNameCompare;
        return this.age - user.getAge();
    }
}
