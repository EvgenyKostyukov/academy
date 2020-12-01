package by.academy.homework4.Task2;

public class Task2<T> {

    public final static int SIZE_ARR = 2;
    private int sizeArray;
    T[] myArray;

    public Task2() {
        myArray = (T[]) (new Object[16]);
    }

    public Task2(int i) {
        myArray = (T[]) (new Object[i]);
    }

    public void printArray() {
        for (int i = 0; i < myArray.length; i++) {
            System.out.print((T) myArray[i] + " ");
        }
        System.out.println();
    }

    public T addTObj(T obj) {
        if (myArray == null) {
            myArray = (T[]) new Object[SIZE_ARR];
        } else {
            if (sizeArray + 1 > myArray.length) {
                T[] tempArray = (T[]) (new Object[myArray.length * 2 + 1]);
                System.arraycopy(myArray, 0, tempArray, 0, myArray.length);
                myArray = (T[]) tempArray;
            }
        }
        myArray[sizeArray++] = obj;
        return obj;
    }

    public T getIndex(int i) {
        return (T) myArray[i];
    }

    public T getLast() {
        return (T) myArray[myArray.length - 1];
    }

    public T getFirst() {
        return (T) myArray[0];
    }

    public int length() {
        return myArray.length;
    }

    public int lastIndex() {
        int lastNumber = 0;
        for (int i = 0; i < myArray.length; i++)
            if (myArray[i] == null) {
                lastNumber = i - 1;
                break;
            }
        return lastNumber;
    }

    public void removeElementIntI(int i) {
        T[] tempArray = (T[]) (new Object[myArray.length - 1]);
        System.arraycopy(myArray, 0, tempArray, 0, myArray.length - 1);
        System.arraycopy(myArray, i + 1, tempArray, i, myArray.length - i - 1);
        myArray = (T[]) tempArray;
    }

    public void removeObj(T obj) {
        for (int i = 0; i < myArray.length; i++)
            if (myArray[i] == obj) {
                removeElementIntI(i);
            }
    }
}
