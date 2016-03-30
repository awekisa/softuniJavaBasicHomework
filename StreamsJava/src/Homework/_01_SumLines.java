package Homework;

import java.io.*;
import java.util.Scanner;

/**
 * Created by xxx on 3/22/2016.
 */
public class _01_SumLines {

    private static final String SomeFile = "D:\\Coding\\JAVA\\Homework\\StreamsJava\\src\\Homework\\file.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(SomeFile);
        BufferedReader read = new BufferedReader(new FileReader(file));
        String line;
        int sum = 0;
        while ((line = read.readLine()) != null) {
            sum = 0;
            for (int i = 0; i < line.length(); i++) {
                sum += line.charAt(i);
            }
            System.out.println(sum);
        }
    }

}
