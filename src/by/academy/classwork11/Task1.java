package by.academy.classwork11;

import java.util.function.Predicate;

public class Task1 {
    public static void main(String[] args) {
        Printable pr = s -> System.out.println(s);
        pr.print("Hello");

        Predicate <String> pred = s -> s!= null;
        System.out.println(pred.test("World"));

        System.out.println("----------------------------------------------------");

        Predicate<String> pred2 = s -> !s.isEmpty();
        System.out.println(pred2.test(""));
        System.out.println(pred2.test("asd"));
//        System.out.println(pred2.test(null));12334rf34345345

        System.out.println(pred.and(pred2).test("dsff"));

        System.out.println("-----------------------------------------");

        Predicate<String> chekJ = s -> s.startsWith("J");
        Predicate<String> chekN = s -> s.startsWith("N");
        Predicate<String> chekA = s -> s.endsWith("A");

        Predicate<String> chekALL = s -> (s.startsWith("J") || s.startsWith("N") && s.endsWith("A"));

        System.out.println(chekALL.test("Java"));

        System.out.println(chekJ.or(chekN).and(chekA).test("AVA"));
        System.out.println(chekJ.or(chekN).and(chekA).test("AV"));
        System.out.println(chekJ.or(chekN).and(chekA).test("JAVA"));
    }
}
