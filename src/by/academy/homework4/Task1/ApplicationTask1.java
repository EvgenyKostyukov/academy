package by.academy.homework4.Task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ApplicationTask1 {

    public static void main(String[] args) throws ParseException {

        Date1 date = new Date1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату согласно паттерна: dd-MM-yyyy: ");
        String enterScannerDate1 = scanner.next();

        while (!date.methodDate(enterScannerDate1)) {
            System.out.println("Не соответствует паттерну: dd-MM-yyyy ");
            enterScannerDate1 = scanner.next();
        }

        System.out.println("Введите вторую дату согласно паттерну: dd-MM-yyyy: ");
        String enterScannerDate2 = scanner.next();
        while (!date.methodDate(enterScannerDate2)) {
            System.out.println("Не соответствует паттерну: dd-MM-yyyy ");
            enterScannerDate2 = scanner.next();
        }
        System.out.println("Разность дней: " + enterScannerDate1 + " и " + enterScannerDate2 +
                " составляет " + date.betweenDate1AndDate2(enterScannerDate1, enterScannerDate2));

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat();
        simpleDateFormat1.applyPattern("dd-MM-yyyy");
        Date myDate = simpleDateFormat1.parse(enterScannerDate1);

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat();

        simpleDateFormat2.applyPattern("dd");
        String day1 = simpleDateFormat2.format(myDate);
        int myDay = Integer.parseInt(day1.trim());

        simpleDateFormat2.applyPattern("MM");
        String month1 = simpleDateFormat2.format(myDate);
        int myMonth = Integer.parseInt(month1.trim());

        simpleDateFormat2.applyPattern("yyyy");
        String myYear = simpleDateFormat2.format(myDate);
        int year1 = Integer.parseInt(myYear.trim());

        simpleDateFormat2.applyPattern("EEEE");

        System.out.println("Ваша дата: " + enterScannerDate1 + " День недели: " + simpleDateFormat2.format(myDate));

        Date1.Year year = date.new Year();
        System.out.println(year.whatYearEnter(year1));

        Date1.Day day = date.new Day();
        System.out.println("День недели при перечислении: " + day.DayTheWeek(year1, myMonth, myDay));
    }
}
