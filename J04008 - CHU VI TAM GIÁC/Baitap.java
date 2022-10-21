package a;
import static java.lang.Math.sqrt;
import java.util.Scanner;

class Point{
    private double x;
    private double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point() {

    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double distance(Point secondPoint){
        return sqrt((secondPoint.x - this.x)*(secondPoint.x-this.x) + (secondPoint.y - this.y)*(secondPoint.y - this.y));
    }

    public double distance(Point p1,Point p2){
        return sqrt((p1.x - p2.x)*(p1.x-p2.x) + (p1.y - p2.y)*(p1.y - p2.y));
    }
    public void Input(Scanner sc){
        x = sc.nextDouble();
        y = sc.nextDouble();
    }
    public String toString(){
        return Double.toString(x)  + " " + Double.toString(y);
    }
}

public class Baitap{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0){
            Point a = new Point();
            Point b = new Point();
            Point c = new Point();
            a.Input(sc);
            b.Input(sc);
            c.Input(sc);
            Double ab = a.distance(b);
            Double ac = a.distance(c);
            Double bc = b.distance(c);
            if(ab >= ac + bc || ac >= bc + ab || bc >= ac + ab){
                System.out.println("INVALID");
            }else System.out.printf("%.3f\n",ab+bc+ac);
       }
    }
    
}

//3
//0 0 0 5 0 199
//1 1 1 1 1 1
//0 0 0 5 5 0