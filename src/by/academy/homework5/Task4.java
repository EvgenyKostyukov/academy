package by.academy.homework5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Task4 {

    public static void main(String[] args) {

        ArrayList<Integer> mark = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int a = (int) (Math.random() * 10 + 1);
            Integer b = (int) (a);
            mark.add(i, b);
        }

        Iterator<Integer> it = mark.iterator();
        Integer max1 = 0;
        while (it.hasNext()) {
            if (max1 == 0) {
                max1 = it.next();
            } else {
                Integer e = it.next();
                if (e.compareTo(max1) > 0) {
                    max1 = e;
                }
            }
        }
        System.out.println("List grade: " + mark);
        System.out.print("Max bal: " + max1);
    }
}

