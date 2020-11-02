package by.academy.homework2;

import java.io.IOException;
import java.util.Scanner;

public class Task5 {

    static int pairs(int k, int[] arr) {
        int pairsCount = 0;
/**
 * это мой говнокод, который не работает... мы прошли базовые темы про циклы
 * массивы и условные операторы и якобы здесь нужно простенький код написать,
 * чтоб программа заработала, но я все форуму пересмотрел, перепробовал
 * много и попал в отчаяние безуспешное.
 *
 *
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int s = arr[first] + arr[last];
            if (s == k) {
                System.out.println(arr[first] + " " + arr[last]);
                first++;
                last--;
            } else {
                if (s < k) first++;
                else last--;
            }

        }
 */
        return pairsCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrItems[i]);
            System.out.println(arr[i]);
        }

        int result = pairs(k, arr);
        System.out.println(result);

        scanner.close();
    }
}





