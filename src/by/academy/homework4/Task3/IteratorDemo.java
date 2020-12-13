package by.academy.homework4.Task3;

public class IteratorDemo {
    public static void main(String[] args) {
        Integer[] arr = {-2,4};
        Iterator<Integer> iterator = new Iterator<>(arr);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
