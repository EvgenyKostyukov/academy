package by.academy.homework2_Part1;

import java.util.*;
import java.lang.*;

class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word1, word2;
        word1 = input.nextLine();
        word2 = input.nextLine();
        if (sort(word1).equals(sort(word2))) {
            System.out.print("true");
        } else System.out.print("false");
        input.close();
    }

    static String sort(String word1) {
        char[] content = word1.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
}