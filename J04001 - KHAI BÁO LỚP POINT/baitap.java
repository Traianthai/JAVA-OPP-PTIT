package a;
import static java.lang.Math.sqrt;
import java.util.Scanner;



public class baitap{
    private static Scanner sc = new Scanner(System.in);
    public class Point{
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
        public String toString(){
            return Double.toString(x)  + " " + Double.toString(y);
        }
    }
    public void process(){
        int z = sc.nextInt();
        while(z-- != 0){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            Point a = new Point(x1,y1);
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            Point b = new Point(x2,y2);
            System.out.println(String.format("%.4f", a.distance(b)));
        }
        
    }
    public static void main(String[] args) {
        baitap a = new baitap();
        a.process();
    }
    
}