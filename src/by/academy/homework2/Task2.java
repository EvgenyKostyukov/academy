package by.academy.homework2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите несколько слов: ");
            String str = scanner.nextLine();
            if ("".equals(str))
                break;
            String shortestWord = str;
            for (String wrd : str.split("[\\p{Space}\\p{Punct}]+"))
                if (wrd.length() < shortestWord.length())
                    shortestWord = wrd;
            System.out.println("Первое слова с минимальным набором символов (" + shortestWord.length() + " символов) это: " + shortestWord);
        }
        scanner.close();
    }
}






