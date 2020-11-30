package by.academy.classwork8;

public class Task3_Apple extends Task3_Fruit {
    String name = "Apple";
    int price=5;
    int sumApple;


    @Override
    void sumFruit() {
        sumApple = weight * price;
        System.out.println(name + " price = " + sumApple);
    }


    }

