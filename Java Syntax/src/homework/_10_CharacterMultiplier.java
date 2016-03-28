package homework;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.Scanner;

/**
 * Created by xxx on 3/19/2016.
 */
public class _10_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        System.out.println(multiplier(first, second));
    }

    private static int multiplier(String first, String second) {

        int sum = 0;
        if (first.length() >= second.length()) {
            for (int i = 0; i < first.length(); i++) {
                if (i < second.length()) {
                    sum += ((int) first.charAt(i) * (int) second.charAt(i));
                } else {
                    sum += (int) first.charAt(i);
                }
            }
        } else {
            for (int i = 0; i < second.length(); i++) {
                if (i < first.length()) {
                    sum += ((int) first.charAt(i) * (int) second.charAt(i));
                } else {
                    sum += (int) second.charAt(i);
                }
            }
        }
        return (sum);
    }
}
