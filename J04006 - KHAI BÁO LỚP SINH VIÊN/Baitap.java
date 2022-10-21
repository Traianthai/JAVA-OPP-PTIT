package a;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class ThiSinh{
    private String hoten, lop, ngaysinh ;
    private Float d1;
    public static Scanner sc = new Scanner(System.in);

    public ThiSinh(String hoten, String ngaysinh, Float d1, Float d2, Float d3) {
        this.hoten = hoten;
        this.lop = lop;
        this.ngaysinh = ngaysinh;
        this.d1 = d1;
    }

    public ThiSinh() {
        this.hoten = "";
        this.lop = "";
        this.ngaysinh = "";
        this.d1 = (float)0;
    }

    public void Input(){
        hoten = sc.nextLine();
        lop = sc.nextLine();
        ngaysinh = sc.nextLine();
        d1 = Float.parseFloat(sc.nextLine());
    }
    public void convertBirthday(){
        try{
            SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
            Date a = d.parse(ngaysinh);
            ngaysinh = d.format(a);
            
        }catch(ParseException e){
            System.out.println(e);
        }    
        
    }
    public void Output(){
        convertBirthday();
        System.out.printf("B20DCCN001 %s %s %s %.2f \n", hoten, lop, ngaysinh, d1);
        
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
//D20CQCN04-B
//1/1/2001
//4
