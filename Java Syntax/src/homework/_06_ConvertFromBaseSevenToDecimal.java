package homework;

import java.util.Scanner;

/**
 * Created by xxx on 3/18/2016.
 */
public class _06_ConvertFromBaseSevenToDecimal {
    public static void main(String[] args) {
        // Longer solution
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int base = 7;
//        char[] numberToChar = ("" + number).toCharArray();
//        int result = 0;
//        int power = 0;
//
//        for (int i = numberToChar.length - 1; i >= 0 ; i--) {
//            result += Character.getNumericValue(numberToChar[i]) * Math.pow(base, power);
//            power++;
//        }
//
//        System.out.println(result);

// shorter solution
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(Integer.valueOf(input, 7));
    }
}
