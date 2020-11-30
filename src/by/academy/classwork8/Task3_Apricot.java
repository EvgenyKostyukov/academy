package by.academy.classwork8;

public class Task3_Apricot extends Task3_Fruit {
    String name = "Apricot";
    int price=15;
    int sumApricot;

    @Override
    void sumFruit() {
        sumApricot = weight * price;
        System.out.println(name + " price = " + sumApricot);
    }

}
