package by.academy.homework2;

import java.util.*;
import java.lang.*;

class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word1, word2;
        word1 = in.nextLine();
        word2 = in.nextLine();
        if (sort(word1).equals(sort(word2))) {
            System.out.print("true");
        } else System.out.print("false");
    }

    static String sort(String word1) {
        char[] content = word1.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
}