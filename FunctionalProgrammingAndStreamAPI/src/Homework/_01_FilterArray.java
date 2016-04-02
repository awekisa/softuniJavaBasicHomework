package Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 * Created by xxx on 3/29/2016.
 */
public class _01_FilterArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        List<String> output = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            output.add(input[i]);
        }
        output.stream().filter(i -> i.length() > 3).forEach(p -> System.out.printf("%s ", p));

    }
}