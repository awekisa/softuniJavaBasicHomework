package homework;

import java.util.Scanner;

/**
 * Created by xxx on 3/19/2016.
 */
public class _08_OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] temp = input.split(" ");

        if (temp.length % 2 == 0) {
            for (int i = 0; i < temp.length; i += 2) {
                if (Integer.parseInt(temp[i]) % 2 == 0 && Integer.parseInt(temp[i + 1]) % 2 == 0) {   /* both even */
                    System.out.printf("%s, %s -> both are even\n", temp[i], temp[i + 1]);
                } else if (Integer.parseInt(temp[i]) % 2 != 0 && Integer.parseInt(temp[i + 1]) % 2 != 0) { /* both odd */
                    System.out.printf("%s, %s -> both are odd\n", temp[i], temp[i + 1]);
                }
                else{
                    System.out.printf("%s, %s -> different\n", temp[i], temp[i+1]);
                }
            }
        } else {
            System.out.println("Invalid length");
        }
    }
}
