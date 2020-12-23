package by.academy.homework6;

import java.io.*;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) throws IOException {
        File homedir = new File(System.getProperty("user.home"));
        File file = new File(homedir, "/101_Programms/IdeaProjects/academy/src/by/academy/homework6/Task1.txt");
        if (!file.exists())
            file.createNewFile();
        PrintWriter pw = new PrintWriter(file);
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        while (!str.equals("stop")) {
            pw.println(str);
            str = sc.nextLine();
        }
        pw.close();
    }
}
