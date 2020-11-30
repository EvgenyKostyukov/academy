// test1111111111 comment

package by.academy.homework1;

public class    Cat {

    private int age;
    private double money;
    private char initials;
    private String isHomeAnimal;
    String nickname;

    public Cat() {
    }

    public Cat(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public Cat(String nickname) {
        this.nickname = nickname;
    }

    public void sleep() {
        System.out.println("Кот " + nickname + " спит");
    }

    public void eat() {
        System.out.println("Кот " + nickname + " ест");
    }

    public void walk() {
        System.out.println("Кот " + nickname + " гуляет");
    }

    public void grow(int addAge) {
        System.out.println("Кот " + nickname + " растет на " + addAge + " год");
        age = age + addAge;
    }

    public void printAge() {
        System.out.println("Кот " + nickname + " age: " + age + " год (года)");
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public char getInitials() {
        return initials;
    }

    public void setInitials(char initials) {
        this.initials = initials;
    }

    public String getIsHomeAnimal() {
        return isHomeAnimal;
    }

    public void setIsHomeAnimal(String isHomeAnimal) {
        this.isHomeAnimal = isHomeAnimal;
    }
}

