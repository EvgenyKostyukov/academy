package by.academy.homework3;

import by.academy.homework3.homework_3_Validator.BelarusPhoneValidator;
import by.academy.homework3.homework_3_Validator.Main;
import by.academy.homework3.homework_3_Validator.Validator;

import java.util.Scanner;

public class Person {

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

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    Scanner s = new Scanner(System.in);

    public void dateBirhday() {
        System.out.println("Введите дату рождения: ");
        dateOfBirth = s.next();
        Task4_ParseDate dateB = new Task4_ParseDate();
        dateB.methodDate1(dateOfBirth);
        while (!dateB.methodDate1(dateOfBirth)) {
            System.out.println("Не верный формат. Повторите: ");
            dateOfBirth = s.next();
        }
        System.out.println("Ваша дата рождения: " + dateOfBirth);
    }

    public void myValidator() {
        System.out.println("Введите телефон в формате +375---------: ");
        String phone = s.next();
        while (!belarusPhoneValidator.isValid(phone)) {
            System.out.println("Не верный формат. Повторите т.: ");
            phone = s.next();
        }
    }

    public void email() {
        System.out.println("Введите свой email: ");
        String email1 = s.next();
        Main main = new Main();
        while (!main.isValid(email1)) {
            System.out.println("Не верный формат. Повторите email: ");
            email1 = s.next();
        }
    }
}
