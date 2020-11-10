package by.academy.homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите тип данных: ");
        String typeData = sc.nextLine();
        switch (typeData) {
            case "int":
                System.out.println("Введите переменную: ");
                int variable = sc.nextInt();
                System.out.println("Вы ввели тип данных \"int\", " +
                        "остаток от деления на 2 вашей переменной = "
                        + (variable % 2) + ";");
                break;
            case "double":
                System.out.println("Введите переменную: ");
                double variable1 = sc.nextDouble();
                System.out.println("Вы ввели тип данных \"double\", " +
                        "70% от вашей переменной = "
                        + (variable1 * 70 / 100) + ";");
                break;
            case "float":
                System.out.println("Введите переменную: ");
                float variable2 = sc.nextFloat();
                System.out.println("Вы ввели тип данных \"float\", " +
                        "ваша переменная в квадарате  = "
                        + variable2 * variable2 + ";");
                break;
            case "char":
                System.out.println("Введите символ: ");
                char variable3 = sc.next().charAt(0);
                int b = (char) variable3;
                System.out.println("Вы ввели тип данных \"char\", " +
                        "ваш код символа  = " + b);
                break;
            case "String":
                System.out.println("Введите строку: ");
                String variable4 = sc.nextLine();
                System.out.println("Hello " + variable4);
            default:
                System.out.println("Unsupported type");
                sc.close();
        }
    }
}

