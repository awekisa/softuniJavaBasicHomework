package Homework;

import jdk.nashorn.internal.ir.WhileNode;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xxx on 3/22/2016.
 */
public class _02_AllCapitals {
    private static String SomeFile = "D:\\Coding\\JAVA\\Homework\\StreamsJava\\src\\Homework\\file02.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(SomeFile);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String text = new String();
        String line = new String();

        while((line = reader.readLine()) != null){
            text += line.toUpperCase() + "\r\n";
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(text);
        writer.flush();
        writer.close();
        reader.close();


    }
}
