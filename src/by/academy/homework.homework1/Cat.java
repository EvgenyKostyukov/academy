// test comment

package by.academy.homework.homework1;

public class Cat {

    public int age;
    private int money;
    public char initials;
    public String isHomeAnimal;
    public String nickname = "NoName";
    public String myNickname = "Barsik";

    public Cat() {}

    public Cat(String myNickname) {
        nickname = myNickname;
    }

    public void sleep() {
        System.out.println("Кот спит");
    }

    public void eat() {
        System.out.println("Кот ест");
    }

    public void walk() {
        System.out.println("Кот гуляет");
    }

    public void sleep1() {
        System.out.println("Кот " + myNickname + " спит");
    }

    public void eat1() {
        System.out.println("Кот " + myNickname + " ест");
    }

    public void walk1() {
        System.out.println("Кот " + myNickname + " гуляет");
    }

    public void grow(int addAge) {
        System.out.println("Кот " + nickname + " растет на " + addAge + " год");
        age = age + addAge;
    }

    public void printAge() {
        System.out.println("Кот " + nickname + " age: " + age + " год (года)");
    }

    public int getMoney() {
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

