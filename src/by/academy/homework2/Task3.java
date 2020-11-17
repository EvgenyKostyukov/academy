package by.academy.homework2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 words: ");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println("Первое слово = " + str1);
        System.out.println("Второе слово = " + str2);
        String str3 = (str1.substring(0, str1.length() / 2)) +
                (str2.substring(str2.length() / 2));
        System.out.println("Результат : " + str3);
        scanner.close();
    }
}


