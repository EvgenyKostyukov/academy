package by.academy.homework5;

    import java.util.Iterator;

    public class Task3<T> implements Iterator<T> {
        private T[][] array;
        private int i, j;

        public Task3(T[][] array) {
            this.array = array;
        }

        @Override
        public boolean hasNext() {
            return i < array.length && j < array[i].length;
        }

        @Override
        public T next() {
            T arr = array[i][j++];
            if (j >= array[i].length) {
                i++;
                j = 0;
            }
            return arr;
        }
    }

