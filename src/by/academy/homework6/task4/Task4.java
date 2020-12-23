//I deleted files from the "files" package (you said not to add).

package by.academy.homework6.task4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task4 {
    public static final String INPUT_FILE_PATH = "user.home/101_Programms/IdeaProjects/academy/src/by/academy/homework6/text.txt";
    public static final String OUTPUT_FILE_PATH = "user.home/101_Programms/IdeaProjects/academy/src/by/academy/homework6/task4/result.txt";

    public static void main(String[] args) {

        File dir = new File("user.home/101_Programms/IdeaProjects/academy/src/by/academy/homework6/task4/files");
        if (!dir.exists()) {
            dir.mkdir();
        }

        File result = new File(OUTPUT_FILE_PATH);
        if (!result.exists()) {
            try {
                result.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        char[] array = new char[576];

        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE_PATH))) {
            while ((reader.read(array)) > 0) ;
            stringBuilder.append(array);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String outputString = stringBuilder.toString();
        Random rand = new Random();
        try (BufferedWriter resWriter = new BufferedWriter(new FileWriter(OUTPUT_FILE_PATH))) {
            for (int i = 1; i <= 100; i++) {
                int randomizer = rand.nextInt(576);
                File file = new File(dir, i + ".txt");
                if (!file.exists()) {
                    try {
                        file.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                try (BufferedWriter filewriter = new BufferedWriter(new FileWriter(file))) {
                    filewriter.write(outputString.substring(0, randomizer));
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
                resWriter.write("File name: " + file.getName() + " & length: " + file.length() + "\n");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}