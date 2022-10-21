package a;

import java.util.Scanner;

public class Point {

    private static double t1;
    private static double t2;
    private double d1;
    private double d2;

    public Point() {
    }

    public Point(double a, double b) {
        d1 = a;
        d2 = b;
    }

    public static Point nextPoint(Scanner s) {
        t1 = s.nextDouble();
        t2 = s.nextDouble();
        return new Point(t1, t2);
    }
    public Double distance(Point a){
        return Math.sqrt(Math.pow(this.d1-a.d1, 2)+Math.pow(this.d2-a.d2, 2));
    }
    
}