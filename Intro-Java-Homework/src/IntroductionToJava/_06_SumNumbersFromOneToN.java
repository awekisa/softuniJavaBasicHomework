package IntroductionToJava;

import java.util.Scanner;

/**
 * Created by xxx on 3/17/2016.
 */
public class _06_SumNumbersFromOneToN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= input; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
