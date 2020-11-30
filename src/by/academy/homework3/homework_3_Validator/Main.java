package by.academy.homework3.homework_3_Validator;

import java.util.Scanner;

public class Main implements Validator {
    public void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите номер телефона: ");
        String numberCountry = scanner1.next();
        System.out.println("Введите емэил: ");
        String numberEmail = scanner1.next();
        AmericanPhoneValidator americanPhoneValidator = new AmericanPhoneValidator();
        BelarusPhoneValidator belarusPhoneValidator = new BelarusPhoneValidator();
        Main enterMail = new Main();
        if (americanPhoneValidator.isValid(numberCountry)) {
            System.out.println("Введён американский номер!");
        } else if (belarusPhoneValidator.isValid(numberCountry)) {
            System.out.println("Введён белорусский  номер!");
        } else {
            System.out.println("Введенный номер не американский и не белорусский!");
        }
        if (enterMail.isValid(numberEmail))
            System.out.println("Введён корректный email");
        else System.out.println("Ошибка! Введён некорректный email!");
        scanner1.close();
    }

    @Override
    public boolean isValid(String string) {
        String regex = "\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}";
        return string.matches(regex);
    }
}
