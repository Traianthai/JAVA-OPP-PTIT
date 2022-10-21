package a;
public class Point {

    private double x;
    private double y;

    public Point() {
    }

    public Point(double d1, double d2) {
        this.x = d1;
        this.y = d2;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getD1() {
        return x;
    }

    public double getD2() {
        return y;
    }

    public double distance(Point secondPoint) {
        double d1 = this.x - secondPoint.x;
        double d2 = this.y - secondPoint.y;
        return Math.sqrt((d1 * d1) + (d2 * d2));
    }
    public String toString(){
        return x + " " + y;
    }
}