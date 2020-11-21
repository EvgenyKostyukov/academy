package by.academy.homework_3_Validator;

public class AmericanPhoneValidator implements Validator {

    @Override
    public boolean isValid(String string) {
        String regex = "^\\+1\\d{10}$";
        return string.matches(regex);
    }
}
