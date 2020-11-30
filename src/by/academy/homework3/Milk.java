package by.academy.homework3;

public class Milk extends Product {

    public static final double MILK_DISCOUNT = 0.7;
    private static int milkCount = 0;
    private int nonStaticMilkCount = 0;
    private String color;

    public Milk(double price, String type, String name, int quantity, String color) {
        super(price, type, name, quantity);
        this.color = color;
        milkCount++;
        nonStaticMilkCount++;
    }

    @Override
    public double discount() {
        if (quantity > 10) {
            return MILK_DISCOUNT;
        }
        return 1;
    }
}

