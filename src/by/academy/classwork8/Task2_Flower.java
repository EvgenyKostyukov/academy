package by.academy.classwork8;

import java.util.Random;

public class Task2_Flower {
    String countryProducer;
    String shelfLife;
    static int price = 5;
}

class Sum {
    static int counter;

    public static void sumMethod() {
        String[] flowers = {
                "Роза", "Гвоздика", "Тюльпан", "Бегония"
        };

        Random random = new Random();

        do {

            for (int i = 0; i < 9; i++) {
                int pos = random.nextInt(flowers.length);
                System.out.println(flowers[pos]);
                counter++;
                if (counter % 3 == 0) System.out.println();
            }
        } while (counter < 9);

        int priceSum = counter * Task2_Flower.price;
        System.out.println("Количество проданных цветов: " + Sum.counter);
        System.out.println("Цена букетов = " + priceSum);
    }
}
