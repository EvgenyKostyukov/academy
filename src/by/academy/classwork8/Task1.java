package by.academy.classwork8;

public class Task1 {
    public static void main(String[] args) {

        Number number1 = new Number();

        Number number2 = new Number();

        Number number3 = new Number();

        Number number4 = new Number();

        System.out.println("Количество созданных телефонов: " + Number.counter);
    }
}

class Number {
    static int counter;

    public Number() {
        counter++;
    }
}
