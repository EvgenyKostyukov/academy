package by.academy.homework6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

    public static final String OUTPUT_FILE_PATH = "user.home/101_Programms/IdeaProjects/academy/src/by/academy/homework6/Task2/result.txt";
    public static final String INPUT_FILE_PATH = "user.home/101_Programms/IdeaProjects/academy/src/by/academy/homework6/Task2/text.txt";

    public static void main(String[] args) {

        File dir = new File("user.home/101_Programms/IdeaProjects/academy/src/by/academy/homework6/Task2");
        if (!dir.exists()) {
            dir.mkdir();
        }

        File output = new File(OUTPUT_FILE_PATH);
        if (!output.exists()) {
            try {
                output.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        char[] array = new char[1024];

        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE_PATH))) {
            while ((reader.read(array)) > 0) ;
            stringBuilder.append(array);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String outputString = stringBuilder.toString();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(output))) {
            writer.write(outputString.replaceAll("\\s", ""));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
