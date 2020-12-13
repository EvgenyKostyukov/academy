package by.academy.homework5;

public class Task3MainMyIterator {

    public static void main(String[] args) {
        String[][] array = new String[][] { { "11", "12" }, { "31", "42", "53", "64", "75" }, { "81", "92" },
                { "109", "234", "3234", "4234", "52", } };
        Task3MyIterator<?> arrayIterator = new Task3MyIterator(array);
        while (arrayIterator.hasNext()) {
            System.out.print(arrayIterator.next() + ", ");
        }
    }
}
