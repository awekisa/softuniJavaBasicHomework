package homework;

import java.util.Scanner;

/**
 * Created by xxx on 3/19/2016.
 */
public class _11_GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        System.out.println(sequence(first, second));

    }

    public static String sequence(String a, String b) {
        String result = new String();
        String[] first = a.split(" ");
        String[] second = b.split(" ");
        int count = Integer.parseInt(second[1]);

        if (second[2].equals("even")) {
            for (int i = 0; i < first.length; i++) {
                if (count > 0) {
                    if (Integer.parseInt(first[i]) % 2 == 0) {
                        result += first[i] + " ";
                        count--;
                    }
                }
            }
        }
        else{
            for (int i = 0; i < first.length ; i++) {
                if (count > 0){
                    if (Integer.parseInt(first[i]) % 2 != 0){
                        result += first[i] + " ";
                        count--;
                    }
                }
            }
        }

        return (result);
    }
}
