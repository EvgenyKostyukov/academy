package by.academy.homework.homework1_Part1;

public class Task4 {
    public static void main(String[] args) {
        int number = 2;
        for (int i = 1; i > 0; i++) {
            double x = Math.pow(number, i);
            if (x >= 1_000_000) {
                break;
            }
            System.out.println("Стпень двойки = " + i);
            System.out.println("Результат = " + x);
        }
    }
}
