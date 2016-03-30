package Homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;

/**
 * Created by xxx on 3/25/2016.
 */
public class _05_SaveAnArrayListOfDoubles {
    public static void main(String[] args) throws IOException {
        List<Double> info = Arrays.asList(1.2, 3.2, 2.5);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Coding\\JAVA\\Homework\\StreamsJava\\src\\Homework\\doubles.list"));
        oos.writeObject(info);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Coding\\JAVA\\Homework\\StreamsJava\\src\\Homework\\doubles.list"));

        for (Double item : info) {
            System.out.println(item);
        }
        System.out.println("*************");
        ois.read();
        ois.close();
        for (Double item : info) {
            System.out.println(item);
        }
    }
}

