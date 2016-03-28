package homework;

import java.util.Scanner;

/**
 * Created by xxx on 3/19/2016.
 */
public class _09_HitTheTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 1; i <= 20 ; i++) {
            for (int j = 1; j <= 20 ; j++) {
                if (i+j == input){
                    System.out.printf("%s + %s = %s\n", i, j, input);
                }
            }
        }

        for (int i = 1; i <= 20 ; i++) {
            for (int j = 1; j <= 20 ; j++) {
                if (i-j == input){
                    System.out.printf("%s - %s = %s\n", i, j, input);
                }
            }
        }
    }
}
