package by.academy.homework_3_Deal;

import by.academy.homework_3_Validator.AmericanPhoneValidator;
import by.academy.homework_3_Validator.BelarusPhoneValidator;
import by.academy.homework_3_Validator.Validator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {

    public static final Validator americanPhoneValidator = new AmericanPhoneValidator();
    public static final Validator belarusPhoneValidator = new BelarusPhoneValidator();

    String name;
    double cash;
    String dateOfBirth;

    public Person(String name, double cash) {
        super();
        this.name = name;
        this.cash = cash;
    }

    public Person() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void dateOfBirth() {
        Scanner scannerBirth = new Scanner(System.in);
        System.out.println("Для завершения сделки \n введите вашу дату рождения dd/MM/yyyy или dd-MM-yyyy : ");
        String enterBirth = scannerBirth.next();

        Task3_Date checkBirth = new Task3_Date();
        System.out.println("dd/MM/yyyy - " + checkBirth.MethodDate1(enterBirth));
        System.out.println("dd-MM-yyyy - " + checkBirth.MethodDate2(enterBirth));
    }

    public void number() {
    }

    public void belNomer() {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите белоруский номер телефона: ");
        String number = scanner1.next();
        Person v = new Person();
        if (v.isValid(number)) {
            System.out.println("Правильный белорусский номер!");
            System.out.println("-------------------------------------------------------");
            email();
        } else close();
    }

    Pattern p = Pattern.compile("\\+375((29)|(33)|(25))[0-9]{7}");

    public boolean isValid(String s) {
        Matcher m = p.matcher(s);
        return m.find();
    }

    public void close() {
        System.out.println("Неправильный номер! Перезапустите программу!");
        System.exit(1);
    }

    public void email() {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите email: ");
        String email1 = scanner1.next();

        Person email11 = new Person();
        if (email11.isValid1(email1)) {
            System.out.println("Правильный email и белорусский номер! \n Совершите сделку!");
            System.out.println("-------------------------------------------------------");
        } else close1();
    }

    Pattern v1 = Pattern.compile("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}");

    public boolean isValid1(String s) {
        Matcher m = v1.matcher(s);
        return m.find();
    }

    public void close1() {
        System.out.println("Неправильный номер или email! Перезапустите программу!");
        System.exit(1);
    }
}
