package by.academy.homework_3_Deal;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Deal implements DealInterface {

    public final static int DEFAULT_PRODUCT_SIZE = 2;

    private String date;
    private Person seller;
    private Person buyer;
    private Product[] products;
    private int productCounter;

    public Deal() {
        super();
    }

    public Deal(String date, Person seller, Person buyer) {
        super();
        this.date = date;
        this.seller = seller;
        this.buyer = buyer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Person getSeller() {
        return seller;
    }

    public void setSeller(Person seller) {
        this.seller = seller;
    }

    public Person getBuyer() {
        return buyer;
    }

    public void setBuyer(Person buyer) {
        this.buyer = buyer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public void addProduct(Product product) {

        if (products == null) {
            products = new Product[DEFAULT_PRODUCT_SIZE];
        } else {
            if (productCounter + 1 > products.length) {
                expandProductArray();
            }
        }
        products[productCounter++] = product;
    }

    @Override
    public void deleteProduct(int index) {

        if (index > products.length || index < 0) {
            return;
        }
        if (productCounter != index) {
            System.arraycopy(products, index + 1, products, index, products.length - index - productCounter);
        }
        products[productCounter] = null;
        productCounter--;
    }

    private void expandProductArray() {
        Product[] tempArray = new Product[products.length * 2 + 1];
        System.arraycopy(products, 0, tempArray, 0, products.length);
        products = tempArray;
    }

    public void result() {
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice() * product.getQuantity();
        }
        if (sum > buyer.getCash()) {
            System.out.println("Недостаточно средств! ");
        } else {
            printBill();
        }
    }

    private void printBill() {
        double summ = 0;
        System.out.println("Сделка совершена ");
        for (Product product : products) {
            double totalProductPrice = product.getPrice() * product.getQuantity();
            summ += totalProductPrice;
            System.out.println("Имя: " + product.getProducerName() + " " + product.getPrice() + "X"
                    + product.getQuantity() + "=" + totalProductPrice);
        }
        System.out.println("Сумма всей сделки " + summ);
        buyer.setCash(buyer.getCash() - summ);
        seller.setCash(seller.getCash() + summ);
        System.out.println("Деньги покупателя " + buyer.getCash());
        System.out.println("Деньги продавца " + seller.getCash());

    }

    public void printProducts() {
        for (int i = 0; i < productCounter; i++) {
            Product p = products[i];
            System.out.println("Name: " + p.getProducerName());
            System.out.println("Type: " + p.getType());
            System.out.println("Total Price: " + p.calcTotalPrice());
            System.out.println("-----------------");
        }
    }

    @Override
    public void deal() {
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice() * product.getQuantity();
        }
        if (sum > buyer.getCash()) {
            System.out.println("Недостаточно средств! ");
        } else {
            printBill();
        }
    }

    public void result1() {
        Deal dead = new Deal();
        String taskNumber;
        System.out.println("Дата сделки: " + getDate());
        System.out.println("Продавец: " + seller.getName() + "\nПокупатель: " + buyer.getName());
        System.out.println("Совершите сделку! \n" +
                "Цена продуктов:  Meat - 10,  Vine - 20, Milk - 30 " +
                "\nВыберете номер  товара: \n1 - Meat, \n2 - Vine, \n3 - Milk. ");
        taskNumber = scannerNumber();

        do {
            switch (taskNumber) {
                case "1":
                    do {
                        System.out.println("Продукт - Meat");
                        calcProduct.getPriceMeat();
                        System.out.println("Хотите продолжить покупки? \n если " +
                                "да - выберете номер продукта, нет - нажмите 0");
                        taskNumber = scannerNumber();
                    } while (taskNumber.equals("1"));
                    break;

                case "2":
                    do {
                        System.out.println("Продукт - Vine");
                        calcProduct.getPriceVine();
                        System.out.println("Хотите продолжить покупки? \n если " +
                                "да - выберете номер продукта, нет - нажмите 0");
                        taskNumber = scannerNumber();
                    } while (taskNumber.equals("2"));
                    break;

                case "3":
                    do {
                        System.out.println("Продукт - Milk");
                        calcProduct.getPriceMilk();
                        System.out.println("Хотите продолжить покупки? \n если " +
                                "да - выберете номер продукта, нет - нажмите 0");
                        taskNumber = scannerNumber();
                    } while (taskNumber.equals("3"));
                    break;
            }
        } while (taskNumber.matches("[1-3]"));


        if (taskNumber.equals("0")) {
            System.out.print("Общая сумма сделки составляет: ");
            calcProduct.finishSum();
        }

        if (calcProduct.finishSum > buyer.getCash()) {
            System.out.println("Недостаточно средств! \n у покупателя в наличии " + buyer.getCash());
        } else {
            printFin();
        }
    }

    public void printFin() {
        System.out.println("------------------------------------------------------");
        System.out.println();
        System.out.println("Сделка прошла успешно!");
        System.out.println("Информация о сделке: \nДата сделки: " + getDate());
        System.out.print("Dead line deal: ");
        deadLineDate();
        System.out.println("Продавец: " + seller.getName() + "\nПокупатель: " + buyer.getName());
        System.out.print("Cумма сделки составляет: ");
        calcProduct.finishSum();
        buyer.setCash(buyer.getCash() - calcProduct.finishSum);
        System.out.println("Остаток денег покупателя " + buyer.getCash());
        seller.setCash(seller.getCash() + calcProduct.finishSum);
        System.out.println("Остаток денег продавца " + seller.getCash());
        System.out.println();
    }

    public void deadLineDate() {

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 10);

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(dateFormat.format(calendar.getTime()));
    }

    public static String scannerNumber() {
        Scanner scan = new Scanner(System.in);
        String scannerNumberProduct = scan.next();
        return scannerNumberProduct;
    }

    public static class calcProduct {
        private static int sumMeat = 0;
        private static int sumVine = 0;
        private static int sumMilk = 0;
        static int finishSum;

        static void getPriceMeat() {
            System.out.println("Введите количество Meat: ");
            Scanner scan = new Scanner(System.in);
            int quantityMeat = scan.nextInt();
            sumMeat = sumMeat + (10 * quantityMeat);
            System.out.println("Сумма покупки Meat = " + sumMeat);
        }

        static void getPriceVine() {
            System.out.println("Введите количество Vine: ");
            Scanner scan = new Scanner(System.in);
            int quantityVine = scan.nextInt();
            sumVine = sumVine + (20 * quantityVine);
            System.out.println("Сумма покупки Vine = " + sumVine);
        }

        static void getPriceMilk() {
            System.out.println("Введите количество Milk: ");
            Scanner scan = new Scanner(System.in);
            int quantityMilk = scan.nextInt();
            sumMilk = sumMilk + (30 * quantityMilk);
            System.out.println("Сумма покупки Milk = " + sumMilk);
        }

        static void finishSum() {
            finishSum = sumVine + sumMeat + sumMilk;
            System.out.println(finishSum);
        }
    }

    public static void goodBye() {
        System.out.println("Спасибо за сдлеку! До свидания!");
    }
}

