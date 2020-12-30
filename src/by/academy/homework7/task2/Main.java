package by.academy.homework7.task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        User user = new User("Vlad", "123d", "vl@mail.ru");
        Class<User> pers = User.class;
        Method[] methods = pers.getMethods();
        System.out.println("-----------------------");
        System.out.println("Method: ");
        System.out.println("-----------------------");
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        try {
            Method meth = pers.getMethod("printUserInfo");
            System.out.println("-----------------------");
            System.out.println("Method name is: " + meth.getName());
        } catch (NoSuchMethodException | SecurityException e1) {
            System.out.println("-----------------------");
            System.out.println("There is no public methods! ");
        }
        Field[] fieldd = pers.getFields();
        System.out.println("-----------------------");
        System.out.println("Field: ");
        System.out.println("-----------------------");
        for (Field f : fieldd) {
            System.out.println(f.getName());
        }
        try {
            Field fiell = pers.getDeclaredField("login");
            String loginValue = (String) fiell.get(user);
            System.out.println("-----------------------");
            System.out.println("Field name is: " + loginValue);
            System.out.println("-----------------------");
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
        Method[] methodss = pers.getDeclaredMethods();
        System.out.println("DeclaredMethod: ");
        System.out.println("-----------------------");
        for (Method method : methodss) {
            System.out.println(method.getName());
        }
        try {
            Method declareMethod = pers.getDeclaredMethod("printUserInfo");
            System.out.println("-----------------------");
            System.out.println("DeclaredMethod name is: " + declareMethod.getName());
            System.out.println("-----------------------");
        } catch (NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }
        Field[] fielddd = pers.getDeclaredFields(); // getDeclaredFields()
        System.out.println("DeclaredFields: ");
        System.out.println("-----------------------");
        for (Field fiel : fielddd) {
            System.out.println(fiel.getName());
        }
        try {
            Field field = pers.getDeclaredField("password");
            field.setAccessible(true);
            String passwordValue = (String) field.get(user);
            System.out.println("-----------------------");
            System.out.println("DeclaredFields name is: " + passwordValue);
            System.out.println("-----------------------");
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
        try {
            Field fiel = pers.getDeclaredField("login");
            fiel.setAccessible(true);
            String loginValue = (String) fiel.get(user);
            System.out.println("DeclaredFields name is: " + loginValue);
            System.out.println("-----------------------");
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("set метод класса Field: ");
        System.out.println("-----------------------");
        try {
            Field setFiel = pers.getDeclaredField("login");
            setFiel.setAccessible(true);
            setFiel.set(user, "Vlad");
            String log = (String) setFiel.get(user);
            System.out.println("Login is: " + log);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
        try {
            Field setField = pers.getDeclaredField("password");
            setField.setAccessible(true);
            setField.set(user, "123d");
            String pas = (String) setField.get(user);
            System.out.println("Password is: " + pas);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
        try {
            Field setFie = pers.getDeclaredField("email");
            setFie.setAccessible(true);
            setFie.set(user, "vl@mail.ru");
            String emai = (String) setFie.get(user);
            System.out.println("Email is: " + emai);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("----------------");
        System.out.println("toString через invoke:");
        try {
            Method mPrint = pers.getDeclaredMethod("printUserInfo");
            mPrint.setAccessible(true);
            mPrint.invoke(user);
        } catch (NoSuchMethodException | IllegalAccessException | IllegalArgumentException
                | InvocationTargetException | SecurityException e) {
            e.printStackTrace();
        }
    }
}