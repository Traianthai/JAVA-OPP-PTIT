package a;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point p1 = new Point(sc.nextDouble(),sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(),sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(),sc.nextDouble());
            double a = p1.distance(p2);
            double b = p1.distance(p3);
            double c = p2.distance(p3);

            DecimalFormat decf = new DecimalFormat("#0.00");
            if (a + b > c && a + c > b && b + c > a) {
                double res = Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c)) / (double) 4;
                System.out.println(decf.format(res));
            } else {
                System.out.println("INVALID");
            }
        }
    }
}





