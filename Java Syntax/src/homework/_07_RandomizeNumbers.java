package homework;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by xxx on 3/18/2016.
 */
public class _07_RandomizeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int temp = 0;
        Random number = new Random();

        if (min != max) {
            if (min > max) {
                temp = max;
                max = min;
                min = temp;
            }
            List<Integer> sequence = new ArrayList<>();

            for (int i = 0; i < max - min + 1; i++) {
                sequence.add(min + i);
            }
            Collections.shuffle(sequence);
            for (int i = 0; i < sequence.size(); i++) {
                System.out.print(sequence.get(i) + " ");
            }
        } else {
            System.out.println(min);
        }
    }
}
