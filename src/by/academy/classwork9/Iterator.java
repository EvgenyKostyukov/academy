//package by.academy.classwork9;
//
//import java.util.Iterator;
//
//public class Iterator<T> implements java.util.Iterator {
//
//    private T[] array;
//    private int index;
//
//    public Iterator() {
//        super();
//    }
//
//    public Iterator(T[] array) {
//        this.array = array;
//    }
//
//    @Override
//    public boolean hasNext() {
//        if (array == null || array.length <= index) {
//            return false;
//        }
//        return array[index] != null;
//    }
//
//    @Override
//    public T next() {
//        return array[index++];
//    }
//}
//