package homework;

import java.util.Scanner;

/**
 * Created by xxx on 3/18/2016.
 */
public class _05_ConvertFromDecimalSystemToBaseSeven {
    public static void main(String[] args) {
        // longer solution
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int base = 7;
//        int reminder;
//        StringBuilder result = new StringBuilder();
//
//        if (number >= base) {
//            do {
//                reminder = number % base;
//
//                result.insert(0, (char) (reminder + 48));
//                number /= base;
//
//            }
//            while (number > base);
//        }
//            result.insert(0, (char) (number + 48));
//
//            System.out.println(result);
        // shorter solution
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(Integer.toString(number, 7));

    }
}
