package by.academy.homework4.Task2;

public class ApplicationTask2 {
    public static void main(String[] args) {
        Task2<Integer> int2 = new Task2<>(5);
        int2.addTObj(100); //1
        int2.addTObj(220);
        int2.addTObj(320);

        System.out.println("Взятие по индексу: " + int2.getIndex(1)); //2
        System.out.println("Взятие последнего элемента: " + int2.getLast());//3
        System.out.println("Первый элемент: " + int2.getFirst());//4
        System.out.println("Размер массива: " + int2.length());//5
        System.out.println("Индекс последнего заполненного элемента: " + int2.lastIndex());//6
        int2.removeElementIntI(2);//7
        int2.removeObj(100);//8
        int2.printArray();
    }
}

