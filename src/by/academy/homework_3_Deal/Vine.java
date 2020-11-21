package by.academy.homework_3_Deal;

public class Vine extends Product {

    public Vine(double price, String type, String producerName, int quantity) {
        super(price, type, producerName, quantity);
    }

    @Override
    public double discount() {
        if (quantity * price > 100) {
            return 0.95;// 5% discount
        }
        return 1;
    }
}
