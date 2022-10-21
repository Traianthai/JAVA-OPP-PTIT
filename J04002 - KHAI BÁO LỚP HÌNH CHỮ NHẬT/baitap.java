package a;

import java.util.Scanner;






public class baitap{
    private static Scanner sc = new Scanner(System.in);
    public class Rectange{
        private double width;
        private double height;
        private String color;
        public Rectange() {
        }
        public Rectange(double width, double height, String color) {
            this.width = width;
            this.height = height;
            this.color = color;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
        public double findArea(){
            return width*height;
        }
        public double findPerimeter(){
            return (width+height)*2;
        }
        public String convertColor() {
            return String.valueOf(color.charAt(0)).toUpperCase() + color.substring(1).toLowerCase();
        }
    }
    public void process(){
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String c = sc.next().toLowerCase();
        Rectange r = new Rectange(a,b,c);
        if(a <= 0 || b <= 0) System.out.println("INVALID");
        else {
            System.out.println(String.format("%d %d %s", (int)r.findPerimeter(), (int)r.findArea(),r.convertColor()));
        }
        
    }
    public static void main(String[] args) {
        baitap a = new baitap();
        a.process();
    }
    
}