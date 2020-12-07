package by.academy.homework4.Task2;

public class Task2<T> {

    public static final int DEFAULT_ARRAY_SIZE = 4;
    private T[] array;
    private int arraySize;

    public Task2() {
        array = (T[]) new Object[16];
    }

    public Task2(int arrayLength) {
        super();
        array = (T[]) new Object[arrayLength];
    }

    public void add(T obj) {
        if (array == null) {
            array = (T[]) new Object[DEFAULT_ARRAY_SIZE];
        } else if (arraySize + 1 > array.length) {

            T[] tempArray = (T[]) (new Object[array.length * 2 + 1]);
            System.arraycopy(array, 0, tempArray, 0, array.length);
            array = (T[]) tempArray;
        }
        array[arraySize++] = obj;
    }

    public void getIndex(int i) {
        if ((i < array.length) && (i >= 0)) {
            System.out.println(i + " element is " + array[i]);
        } else {
            System.out.println("Error! Incorrect index! ");
        }
    }

    public void getLast() {
        System.out.println("Last element is " + array[array.length - 1]);
    }

    public void getFirst() {
        System.out.println("First element is " + array[0]);
    }

    public int getLength() {
        return array.length;
    }

    public void getIndexOfLast() {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != null) {
                System.out.println("Last element index is " + i);
                break;
            }
        }
    }

    public void removeIndex(int i) {
        if ((i < array.length) && (i >= 0)) {
            for (int k = i; k < array.length - 1; k++) {
                array[k] = array[k + 1];
            }
            T[] tempArray = (T[]) (new Object[array.length - 1]);
            System.arraycopy(array, 0, tempArray, 0, array.length - 1);
            array = tempArray;
        }
    }

    public void removeValue(T obj) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == obj) {
                removeIndex(i);
            }
        }
    }

    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print((T) array[i] + " ");
        }
        System.out.println("");
    }
}