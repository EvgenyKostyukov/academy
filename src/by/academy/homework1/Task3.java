package by.academy.homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число от 1 до 10: ");
        int x = scan.nextInt();
        System.out.println("Ваше число = " + x);
        System.out.println("Таблица умножения для \nвашего числа от 1 до 10: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(" " + i * x);
            scan.close();
        }
    }
}

