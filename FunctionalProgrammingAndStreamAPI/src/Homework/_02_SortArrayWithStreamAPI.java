package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 * Created by xxx on 3/29/2016.
 */
public class _02_SortArrayWithStreamAPI {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        String cond = sc.nextLine();
        List<String> output = new ArrayList<>();
        for (String s : input) {
            output.add(s);
        }
        if (ascending().test(cond) == true){
            output.stream().sorted((e1, e2) -> e1.compareTo(e2) ).forEach(e -> System.out.printf("%s ", e));
        }
        else{
            output.stream().sorted((e1, e2) -> e2.compareTo(e1)).forEach(e -> System.out.printf("%s ", e));
        }
    }
    public static Predicate<String> ascending(){
        return p -> p.equals("Ascending");
    }
}
