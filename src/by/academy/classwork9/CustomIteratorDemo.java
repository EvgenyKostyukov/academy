package by.academy.classwork9;

import by.academy.classwork9.CustomIterator;

public class CustomIteratorDemo {

    public static void main(String[] args) {

        Integer[] arr = { 1, 6, 9, 8 };

        CustomIterator<Integer> iterator = new CustomIterator<>(arr);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
