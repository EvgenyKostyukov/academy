package by.academy.homework6.task3;

public class User {

    private String name;
    private String lastName;
    private int age;

    public User(String name, String lastName, int age) {

        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(name + "_" + lastName);

        return builder.toString();
    }

}
