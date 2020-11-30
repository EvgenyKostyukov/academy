package by.academy.homework3;

public class Beef extends Product {

    public Beef(double price, String type, String producerName, int quantity) {
        super(price, type, producerName, quantity);
    }

    @Override
    public double discount() {
        if (producerName.contains("Bel")) {
            return 0.8;
        }
        return 1;
    }
}
