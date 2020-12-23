package by.academy.classwork12;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Application {
    public static void main(String[] args) {

        Class<Cat> clz = Cat.class;

        Field[] fields = clz.getDeclaredFields();
        System.out.println("Declared fields: ");
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        Field[] fieldss = clz.getDeclaredFields();
        System.out.println("fields: ");
        for (Field field : fieldss) {
            System.out.println(field.getName());
        }

        Method[] methods = clz.getDeclaredMethods();
        System.out.println("Declared methods: ");
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        Method[] methodss = clz.getDeclaredMethods();
        System.out.println("methods: ");
        for (Method method : methodss) {
            System.out.println(method.getName());
        }


        System.out.println("------------------------------------------------------");
        Class<Tiger> clzTiger = Tiger.class;
        Field[] fieldsTiger = clzTiger.getDeclaredFields();
        System.out.println("Declared fields: ");
        for (Field field : fieldsTiger) {
            System.out.println(field.getName());
        }

        Field[] fieldssTiger = clzTiger.getDeclaredFields();
        System.out.println("fields: ");
        for (Field field : fieldssTiger) {
            System.out.println(field.getName());
        }



    }
}
