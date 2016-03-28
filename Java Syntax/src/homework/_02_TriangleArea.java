package homework;

import java.util.Scanner;

/**
 * Created by xxx on 3/17/2016.
 */
public class _02_TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] pointA = (a.split(" "));
        String b = sc.nextLine();
        String[] pointB = (b.split(" "));
        String c = sc.nextLine();
        String[] pointC = (c.split(" "));
        int xA = 0;
        int yA = 0;
        int xB = 0;
        int yB = 0;
        int xC = 0;
        int yC = 0;


            xA = Integer.parseInt(pointA[0]);
            yA = Integer.parseInt(pointA[1]);
            xB = Integer.parseInt(pointB[0]);
            yB = Integer.parseInt(pointB[1]);
            xC = Integer.parseInt(pointC[0]);
            yC = Integer.parseInt(pointC[1]);

        int area = ((xA*(yB - yC)) + (xB*(yC - yA)) + (xC*(yA - yB))) / 2;
        System.out.println(Math.abs(area));
    }

}

