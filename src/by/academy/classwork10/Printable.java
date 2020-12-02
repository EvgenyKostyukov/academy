package by.academy.classwork10;

public interface Printable {

    String printable[] = {"Book1", "Book2", "Book3", "Magazine1", "Magazine2", "Magazine3"};

    void print();
}

class Book implements Printable {
    public static void main(String[] args) {
        Book book = new Book();
        book.print();

        Magazine magazine = new Magazine();
        magazine.print();

    }

    @Override
    public void print() {
        for (int i = 0; i < printable.length; i++) {
            System.out.println(printable[i]);
        }
    }

    static void printBooks(Printable[] printable){
        if(printable instanceof Printable[]){

        }
        System.out.println();
    }
}

class Magazine implements Printable {
    @Override
    public void print() {
        for (int i = 0; i < printable.length; i++) {
            System.out.println(printable[i]);
        }


    }
}
