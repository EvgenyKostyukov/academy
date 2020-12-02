package by.academy.classwork10;

public class OOP_Phone {
    public static void main(String[] args) {

        OOP_Phone OOPPhone1 = new OOP_Phone(1111, "Apple", 120);
        OOP_Phone OOPPhone2 = new OOP_Phone(2222,"Nokia");
        OOP_Phone OOPPhone3 = new OOP_Phone(3333,"Samsung");

        System.out.println(OOPPhone1.receiveCall(" Tom ") + OOPPhone1.getNumber());
        System.out.println(OOPPhone1.receiveCall(" Sam ", 5555));


        OOPPhone1.sendMessage(375333414902L,375293414902L,375253414902L,444,555);
    }


    long number = 375333414902L;
    String model = "Apple";
    int weight = 200;

    public OOP_Phone(long number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public OOP_Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

    public OOP_Phone() {
    }


    public void setNumber(long number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    String receiveCall(String name) {
        return "Звонит" + name;
    }

    String receiveCall(String name, long number){
        return "Имя звонящего: " + name + " Номер звонящего: " + number;
    }

    void sendMessage(long ... number){
        for(long example: number)
        System.out.println("You send message! " + example );
    }

    public long getNumber() {
        return number;
    }
}
