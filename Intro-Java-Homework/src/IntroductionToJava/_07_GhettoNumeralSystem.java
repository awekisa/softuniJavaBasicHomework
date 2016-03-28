package IntroductionToJava;

import java.util.Scanner;

/**
 * Created by xxx on 3/17/2016.
 */
public class _07_GhettoNumeralSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String output = new String();
        int[] number = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            number[i] = input.charAt(i) - '0';
        }
        for (int i = 0; i < number.length; i++) {
            switch (number[i]) {
                case 0:
                    output += "Gee";
                    break;
                case 1:
                    output += "Bro";
                    break;
                case 2:
                    output += "Zuz";
                    break;
                case 3:
                    output += "Ma";
                    break;
                case 4:
                    output += "Duh";
                    break;
                case 5:
                    output += "Yo";
                    break;
                case 6:
                    output += "Dis";
                    break;
                case 7:
                    output += "Hood";
                    break;
                case 8:
                    output += "Jam";
                    break;
                case 9:
                    output += "Mack";
                    break;


            }
        }
        System.out.println(output);
    }
}
