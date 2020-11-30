package by.academy.classwork8;

public class Task3_Application {
    public static void main(String[] args) {
        Task3_Apple apple = new Task3_Apple();
        apple.sumFruit();

        Task3_Pear pear = new Task3_Pear();
        pear.sumFruit();

        Task3_Apricot apricot =  new Task3_Apricot();
        apricot.sumFruit();


        System.out.println("Общая стоимость продуктов: " + (apple.sumApple + pear.sumPear + apricot.sumApricot));

        }
    }

