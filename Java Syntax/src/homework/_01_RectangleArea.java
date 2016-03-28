package homework;

import java.util.Scanner;

/**
 * Created by xxx on 3/17/2016.
 */
public class _01_RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int rectArea = a * b;
        System.out.println(rectArea);
    }
}
