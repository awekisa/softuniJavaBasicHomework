package homework;

import java.util.Scanner;

/**
 * Created by xxx on 3/18/2016.
 */
public class _04_CalculateExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double formulaOne = Math.pow((((Math.pow(a, 2) + Math.pow(b, 2))/((Math.pow(a, 2) - (Math.pow(b, 2)))))), (a+b+c) / Math.sqrt(c));
        double formulaTwo = Math.pow((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3)),(a-b));

        double numbersAvrg = (a+b+c)/3;
        double formulaAvrg = (formulaOne + formulaTwo) / 2;

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", formulaOne, formulaTwo, Math.abs(numbersAvrg - formulaAvrg));

    }
}
