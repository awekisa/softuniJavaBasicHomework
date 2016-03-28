package homework;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

import java.util.Scanner;

/**
 * Created by xxx on 3/17/2016.
 */
public class _03_FormattingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String binaryA = Integer.toString(a);
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.printf("|%-10s|", Integer.toHexString(a).toUpperCase());
        System.out.printf(String.format("%10s|", Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.printf("%10.2f|", b);
        System.out.printf("%-10.3f|", c);
    }
}
