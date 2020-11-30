package by.academy.homework3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.Scanner;

public class Task4_ParseDate {
    public static void main(String[] args) throws ParseException {
        Scanner scannerDate1 = new Scanner(System.in);
        System.out.println("Введите дату: ");
        String stringDate1 = scannerDate1.next();
        Task4_ParseDate task4_parseDate = new Task4_ParseDate();
        if (task4_parseDate.methodDate1(stringDate1)) {
            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat();
            simpleDateFormat1.applyPattern("dd/MM/yyyy");
            Date enterDate = simpleDateFormat1.parse(stringDate1);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat();
            simpleDateFormat2.applyPattern("dd");
            System.out.println("День: " + simpleDateFormat2.format(enterDate));
            simpleDateFormat2.applyPattern("MM");
            System.out.println("Месяц: " + simpleDateFormat2.format(enterDate));
            simpleDateFormat2.applyPattern("yyyy");
            System.out.println("Год: " + simpleDateFormat2.format(enterDate));
        } else if (task4_parseDate.methodDate2(stringDate1)) {
            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat();
            simpleDateFormat1.applyPattern("dd-MM-yyyy");
            Date date = simpleDateFormat1.parse(stringDate1);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat();
            simpleDateFormat2.applyPattern("dd");
            System.out.println("День: " + simpleDateFormat2.format(date));
            simpleDateFormat2.applyPattern("MM");
            System.out.println("Месяц: " + simpleDateFormat2.format(date));
            simpleDateFormat2.applyPattern("yyyy");
            System.out.println("Год: " + simpleDateFormat2.format(date));
        } else {
            System.out.println("Дата некорректна!");
        }
        scannerDate1.close();
    }

    public boolean methodDate1(String string) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[0/]((19|20)\\d\\d)$";
        return string.matches(regex);
    }

    public boolean methodDate2(String string) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])[-](0[1-9]|1[012])[-]((19|20)\\d\\d)$";
        return string.matches(regex);
    }
}


