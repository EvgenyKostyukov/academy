package by.academy.homework.homework1_Part1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sumBuy = new Scanner(System.in);
        System.out.println("Введите сумму покупки в рублях: ");
        int sum = sumBuy.nextInt();
        System.out.println("Введите ваш возраст: ");
        int age = sumBuy.nextInt();

        if (sum <= 99) {
            System.out.println("Цена с учетом скидки: " + (sum - (sum * 5 / 100))
                    + " рублей(рубля)");
        } else if (sum <= 199) {
            System.out.println("Цена с учетом скидки: " + (sum - (sum * 7 / 100))
                    + " рублей(рубля)");
        } else if (sum <= 299 && age > 18) {
            System.out.println("Цена с учетом скидки: " + (sum - (sum * (12 + 4) / 100))
                    + " рублей(рубля)");
        } else if (sum <= 299 && age < 18) {
            System.out.println("Цена с учетом скидки: " + (sum - (sum * (12 - 3) / 100))
                    + " рублей(рубля)");
        } else if (sum <= 399) {
            System.out.println("Цена с учетом скидки: " + (sum - (sum * 15 / 100))
                    + " рублей(рубля)");
        } else if (sum >= 400) {
            System.out.println("Цена с учетом скидки: " + (sum - (sum * 20 / 100))
                    + " рублей(рубля)");
            sumBuy.close();
        }
    }
}
