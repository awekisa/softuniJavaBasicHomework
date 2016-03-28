package IntroductionToJava;

import java.util.Scanner;

/**
 * Created by xxx on 3/17/2016.
 */
public class _08_GetAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        double third = sc.nextDouble();

        double average = (first + second + third) / 3.0;
        System.out.printf("%.2f", average);
    }
}
