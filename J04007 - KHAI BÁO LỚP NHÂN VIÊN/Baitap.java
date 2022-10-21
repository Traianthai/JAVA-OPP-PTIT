package a;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class NhanVien{
    private String ma, hoten, gioitinh, ngaysinh, diachi, tax, ngayki;
    public static Scanner sc = new Scanner(System.in);

    public NhanVien(String ma, String hoten, String gioitinh, String ngaysinh, String diachi, String TAX, String ngayki) {
        this.ma = ma;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.tax = tax;
        this.ngayki = ngayki;
    }

    public NhanVien() {
        this("","","","","","","");
    }

    

    public void Input(){
        hoten = sc.nextLine();
        gioitinh = sc.nextLine();
        ngaysinh = sc.nextLine();
        diachi = sc.nextLine();
        tax = sc.nextLine();
        ngayki = sc.nextLine();
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
        
        System.out.printf("00001 %s %s %s %s %s %S\n", hoten, gioitinh, ngaysinh, diachi, tax, ngayki);
        
    }
        
}

public class Baitap{
    public static void main(String[] args) {
        NhanVien ts = new NhanVien();
        ts.Input();
        ts.Output();
    }
    
}
//Nguyen Van Hoa
//Nam
//22/11/1982
//Mo Lao-Ha Dong-Ha Noi
//8333123456
//31/12/2013