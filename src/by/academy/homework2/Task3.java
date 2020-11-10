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


//        StringBuffer str3 = new StringBuffer();
//        StringBuffer str4 = new StringBuffer();
//
//        str3.append("петя");
//        str4.append("саша");
//
//        int l3 = str3.length();
//        int l4 = str4.length();
//
//        System.out.println("Первое слово = " + str3 + " количество букв " + l3);
//        System.out.println("Второе слово = " + str4 + " количество букв " + l4);
//
//        int d1 = l3 / 2;
//        int d2 = l4 / 2;
//
//        str3.delete(d1, l3);
//        str4.delete(0, d2);
//        System.out.println(str3.toString() + str4.toString());