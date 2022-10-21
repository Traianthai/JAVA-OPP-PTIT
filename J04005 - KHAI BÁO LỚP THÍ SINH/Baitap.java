package a;

import java.util.Scanner;

class ThiSinh{
    private String hoten, ngaysinh ;
    private Float d1,d2,d3;
    public static Scanner sc = new Scanner(System.in);

    public ThiSinh(String hoten, String ngaysinh, Float d1, Float d2, Float d3) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public ThiSinh() {
    }

    public void Input(){
        hoten = sc.nextLine();
        ngaysinh = sc.nextLine();
        d1 = Float.parseFloat(sc.nextLine());
        d2 = Float.parseFloat(sc.nextLine());
        d3 = Float.parseFloat(sc.nextLine());
    }
    public void Output(){
        System.out.print(hoten + " " + ngaysinh + " ");
        System.out.printf("%.1f", (d1+d2+d3));
    }
        
}

public class Baitap{
    public static void main(String[] args) {
        ThiSinh ts = new ThiSinh();
        ts.Input();
        ts.Output();
    }
    
}
//Nguyen Hoang Ha
//11/10/2001
//4.5
//10.0
//5.5