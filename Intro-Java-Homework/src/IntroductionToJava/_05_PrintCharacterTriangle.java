package IntroductionToJava;

import java.util.Scanner;

/**
 * Created by xxx on 3/17/2016.
 */
public class _05_PrintCharacterTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 0; i <= input; i++) {                           /* upper part */
            for (char j = 'a'; j < i + 97; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = input-1; i >= 0; i--) {                        /* bottom part */
            for (char j = 'a'; j < i + 97; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
