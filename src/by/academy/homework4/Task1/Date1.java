package by.academy.homework4.Task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Date1 {

    public long betweenDate1AndDate2(String enterScannerDate1, String enterScannerDate2) throws ParseException {
        Date startDate = new SimpleDateFormat("dd-MM-yyyy").parse(enterScannerDate1);
        Date endDate = new SimpleDateFormat("dd-MM-yyyy").parse(enterScannerDate2);
        Calendar calendarStart = Calendar.getInstance();
        calendarStart.setTimeInMillis(startDate.getTime());
        Calendar calendarEnd = Calendar.getInstance();
        calendarEnd.setTimeInMillis(endDate.getTime());
        long difference = calendarEnd.getTimeInMillis() - calendarStart.getTimeInMillis();
        long days = difference / (24 * 60 * 60 * 1000);
        return days;
    }

    public boolean methodDate(String s) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])[-](0[1-9]|1[012])[-]((19|20)\\d\\d)$";
        return s.matches(regex);
    }

    class Year {
        public String whatYearEnter(int year) {
            if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
                return year + " високосный год ";
            } else {
                return year + " не високосный год";
            }
        }
    }

    class Day {
        public String DayTheWeek(int year, int month, int chislo) {
            String day = "";
            GregorianCalendar cal = new GregorianCalendar(year, month, chislo);
            int days = cal.get(Calendar.DAY_OF_WEEK);
            switch (days) {
                case 1:
                    day = "Monday";
                    break;
                case 2:
                    day = "Tuesday";
                    break;
                case 3:
                    day = "Wednesday";
                    break;
                case 4:
                    day = "Thursday";
                    break;
                case 5:
                    day = "Friday";
                    break;
                case 6:
                    day = "Saturday";
                    break;
                case 7:
                    day = "Sunday";
                    break;
            }
            return day;
        }
    }
}

