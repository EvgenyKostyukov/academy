package by.academy.homework6.task3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        ArrayList<User> ar = new ArrayList<User>();
        ar.add(new User("Tom", "Petrov", 18));
        ar.add(new User("Sam", "Ivanov", 45));
        ar.add(new User("Andrey", "Sila", 34));
        ar.add(new User("IT", "Academy", 56));
        ar.add(new User("Vova", "Such", 12));
        ar.add(new User("Misha", "Sidorov", 4));
        ar.add(new User("Sveta", "Nasha", 54));
        ar.add(new User("Vika", "Nol", 9));
        ar.add(new User("Jack", "Ruzvelt", 13));
        ar.add(new User("Lul", "Luk", 53));

        System.out.println(ar.toString());
        File homedir = new File(System.getProperty("user.home"));
        File dir = new File(homedir, "/101_Programms/IdeaProjects/academy/src/by/academy/homework6/task3/users");

        if (!dir.exists()) {
            dir.mkdir();
        }

        for (User per : ar) {
            File file = new File(dir, (per.toString()) + ".txt");

            if (!file.exists()) {

                file.createNewFile();
            }

            try (FileWriter fw = new FileWriter(file)) {
                fw.write(per.toString());
            } catch (Exception e) {

                System.out.println(e.getMessage());
            }
        }
    }
}