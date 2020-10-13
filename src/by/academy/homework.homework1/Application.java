
/*
* comments
* this is test program about cats,
* using cod conventions.
*/

package by.academy.homework.homework1;

public class Application {
    public static void main(String[] args) {

        System.out.println();
        Cat cat = new Cat();
        Cat cat2 = new Cat();

        System.out.println("Первый кот без клички: " + cat.nickname);
        System.out.println("У второго кота кличка: " + cat2.myNickname);
        System.out.println();

        cat.sleep();
        cat.eat();
        cat.walk();
        System.out.println();

        cat.sleep1();
        cat.eat1();
        cat.walk1();
        System.out.println();

        cat.grow(1);
        cat.printAge();
        cat.grow(1);
        cat.printAge();
        cat.grow(1);
        cat.printAge();
        System.out.println();

        cat.setMoney(5);
        System.out.println("У кота есть деньги: " + cat.getMoney() + " $");
        System.out.println();

        cat.setInitials('B');
        System.out.println("Первая буква клички кота: " + cat.getInitials());
        System.out.println();

        cat.setIsHomeAnimal("Yes");
        System.out.println("Кот - это домашнее " +
                "животное? " + cat.getIsHomeAnimal());
    }
}
