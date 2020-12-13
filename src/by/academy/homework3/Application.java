//package by.academy.homework3;
//
//import java.time.LocalDate;
//import java.util.Scanner;
//
//public class Application {
//
//    public static void main(String[] args) {
//
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Введите имя покупателя: ");
//        String sellerName = scanner1.next();
//        System.out.println("Введите имя продавца: ");
//        String buyerName = scanner1.next();
//        System.out.println("Введите сумму денег покупателя: ");
//        int sumBuyer = scanner1.nextInt();
//
//        Person lookMethod = new Person();
//        lookMethod.email();
//        lookMethod.dateBirhday();
//        lookMethod.myValidator();
//        Person seller = new Person(sellerName, 0.00);
//        Person buyer = new Person(buyerName, sumBuyer);
//
//        Deal deal = new Deal("18-11-2020", seller, buyer);
//        System.out.println("Добавить продукт? Да - 1; Нет - 0 и т.д.");
//        int addProduct = scanner1.nextInt();
//
//        while (addProduct == 1) {
//            System.out.println("Выбирете продукт для добавления: beef - 0; Vine - 1; Milk - 2; ");
//
//            int lookSwitch = scanner1.nextInt();
//            switch (lookSwitch) {
//                case 1:
//                    System.out.println("Укажите количество?");
//                    int look1 = scanner1.nextInt();
//                    deal.addProduct(new Vine(15.00, "drinke", "Vine", look1));
//                    break;
//                case 0:
//                    System.out.println("Укажите количество?");
//                    int look2 = scanner1.nextInt();
//                    deal.addProduct(new Beef(17.00, "meat", "beef", look2));
//                    break;
//                case 2:
//                    System.out.println("Укажите количество?");
//                    int look3 = scanner1.nextInt();
//                    deal.addProduct(new Milk(10.00, "bacaleya", "Milka", look3, "Blake"));
//                    break;
//            }
//
//            System.out.println("Добавить продукт? Да - 1; Нет - 0 и т.д.");
//            addProduct = scanner1.nextInt();
//        }
//
//        deal.printProducts();
//        System.out.println("Удалить продукт? Да - 1; Нет - 0 и т.д.");
//        int forWhile = scanner1.nextInt();
//
//        while (forWhile == 1) {
//            System.out.println("Выбирете продукт для удаления: beef - 0; Vine - 1; Milk - 2; ");
//
//            int itsWhileScan = scanner1.nextInt();
//
//            deal.deleteProduct(itsWhileScan);
//            System.out.println("Удалить продукт? Да - 1; Нет - 0 и т.д.");
//            forWhile = scanner1.nextInt();
//        }
//
//        System.out.println("---------------------------------------");
//        deal.printProducts();
//        deal.deal();
//
//        LocalDate lookDay = LocalDate.now();
//        System.out.println("Дата начала сделки: " + lookDay);
//        System.out.println("Дата окончания сделки: " + lookDay.plusDays(10));
//    }
//}
