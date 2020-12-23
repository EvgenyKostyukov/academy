package by.academy.classwork12;

public class Tiger extends Cat{
    private int age;
    public String name;
    protected int lines;

    public void run(){
        System.out.println("Тигр бежит");
    }

    public void eat(String s){
        System.out.println("Тигр ест: " + s);
    }

    public void sleep(){
        System.out.println("Тигр спит: ");
    }
}
