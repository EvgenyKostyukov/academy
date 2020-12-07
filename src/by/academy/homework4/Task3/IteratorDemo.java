package by.academy.homework4.Task3;

public class IteratorDemo {
    public static void main(String[] args) {
        Integer[] arr = {1, 7, 9};
        Iterator<Integer> iterator = new Iterator<>(arr);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
