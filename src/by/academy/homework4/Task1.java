package by.academy.homework4;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws ParseException {


        Date d = new Date();
        Calendar c = new GregorianCalendar();
        String date = "11.11.2020";

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        d = format.parse(date);
        System.out.println(c.get(GregorianCalendar.DAY_OF_WEEK));

        class Year {
            public Year() {
            }


        }

        class Month {
            public Month() {
            }
        }

        class Day {
            public Day() {
            }
        }

    }
}
