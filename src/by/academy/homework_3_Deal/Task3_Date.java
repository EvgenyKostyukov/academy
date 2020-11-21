package by.academy.homework_3_Deal;

import java.util.Scanner;

public class Task3_Date {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату: ");
        String enterString = scanner.next();
        scanner.close();

        Task3_Date checkDate = new Task3_Date();
        System.out.println("dd/MM/yyyy - " + checkDate.MethodDate1(enterString));
        System.out.println("dd-MM-yyyy - " + checkDate.MethodDate2(enterString));
        System.out.println("dd.MM.yyyy - " + checkDate.MethodDate3(enterString));
    }

    public boolean MethodDate1(String name1) {
        String regex = "^\\d{2}/\\d{2}/\\d{4}$";
        return name1.matches(regex);
    }

    public boolean MethodDate2(String name2) {
        String regex = "^\\d{2}-\\d{2}-\\d{4}$";
        return name2.matches(regex);
    }

    public boolean MethodDate3(String name3) {
        String regex = "^\\d{2}.\\d{2}.\\d{4}$";
        return name3.matches(regex);
    }
}
