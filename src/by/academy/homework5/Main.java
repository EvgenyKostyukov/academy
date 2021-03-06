package by.academy.homework5;

import java.util.*;

public class Main {
    // Task1
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }

    // Task2
    public static void compare2Lists() {
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        final int N = 1000000;
        final int M = 1000;
        for (int i = 0; i < N; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            arrayList.get((int) (Math.random() * (N - 1)));
        }
        System.out.print("Time 1 - ");
        System.out.println(System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            linkedList.get((int) (Math.random() * (N - 1)));
        }
        System.out.print("Time 2 - ");
        System.out.println(System.currentTimeMillis() - startTime);
    }

    //Task5
    static void buildDictionaryWithMap(String text) {
        text = text.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if ((ch >= 'а' && ch <= 'я') || ch == 'ё') {
                map.compute(ch, (character, integer)
                        -> integer == null ? 1 : integer + 1);
            }
        }
        ArrayList<Map.Entry<Character, Integer>> entries =
                new ArrayList<>(map.entrySet());
        entries.sort((o1, o2) -> Character.compare(o1.getKey(), o2.getKey()));
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        //Task1
        List<String> list = new ArrayList<>();
        list.add("3");
        list.add("3");
        list.add("2");
        list.add("4");
        list.add("4");
        System.out.println(removeDuplicates(list));

        //Task2
        compare2Lists();

        //Task3
        String[][] array = new String[][]{{"11", "12"}, {"31", "42", "53", "64", "75"}, {"81", "92"},
                {"109", "234", "3234", "4234", "52",}};
        Task3<?> arrayIterator = new Task3(array);
        while (arrayIterator.hasNext()) {
            System.out.print(arrayIterator.next() + ", ");
        }

        //Task5
        buildDictionaryWithMap("Привет пока ");
    }
}

