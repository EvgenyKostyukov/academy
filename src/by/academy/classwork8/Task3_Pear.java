package by.academy.classwork8;

public class Task3_Pear extends Task3_Fruit{
    String name = "Pear";
    int price=10;
    int sumPear;


    @Override
    void sumFruit() {
        sumPear = weight * price;
        System.out.println(name + " price = " + sumPear);

    }


}
