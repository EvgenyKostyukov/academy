package by.academy.homework4.Task3;

public class ApplicationIterator {
    public static void main(String[] args) {

        String[] skills = {"Java", "Spring", "Maven"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Evgeny", skills);

        Iterator iterator = javaDeveloper.getMyIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }
    }
}