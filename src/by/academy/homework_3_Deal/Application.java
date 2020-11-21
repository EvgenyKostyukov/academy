package by.academy.homework_3_Deal;

public class Application {

    public static void main(String[] args) {

        Person seller = new Person("Vasya", 200);
        Person buyer = new Person("Petya", 300);

        Deal deal = new Deal("21-11-2020", seller, buyer);

        deal.addProduct(new Meat(15.00, "meat", "Academy Bel", 7));
        deal.addProduct(new Vine(7.00, "vine", "peach", 7));
        deal.addProduct(new Milk(3.00, "milk", "banana", 15, "black"));

        deal.printProducts();
        deal.deleteProduct(2);
        System.out.println("--------------------------------");
        deal.printProducts();

        Person number1 = new Person();
        number1.belNomer();

        Deal firstDeal = new Deal("19 11 20", seller, buyer);
        firstDeal.result1();

        Person birth = new Person();
        birth.dateOfBirth();

        Deal.goodBye();
    }
}
