package by.academy.homework_3_Validator;

public class BelarusPhoneValidator implements Validator {

    @Override
    public boolean isValid(String string) {
        String regex = "^\\+375\\d{9}$";
        return string.matches(regex);
    }
}
