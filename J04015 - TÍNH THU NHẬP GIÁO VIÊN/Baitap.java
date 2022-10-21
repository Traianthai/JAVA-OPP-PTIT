package a;

import java.util.Scanner;

class Giaovien{
    private String ma,ten;
    private int luong;
    private int bac, phucap;
    public Giaovien() {
    }

    public Giaovien(String ma, String ten, int luong, int bac, int phucap) {
        this.ma = ma;
        this.ten = ten;
        this.luong = luong;
        this.bac = bac;
        this.phucap = phucap;
    }

    public void Input(Scanner sc){
        ma = sc.nextLine();
        ten = sc.nextLine();
        luong = sc.nextInt();
        String res = ma.substring(0,2);
        if(res.equals("HT")) phucap = 2000000;
        else if(res.equals("HP")) phucap = 900000;
        else phucap = 500000;
        bac = Integer.parseInt(ma.substring(2));
    }
    
    public void Output(){
        System.out.printf("%s %s %d %d %d\n",ma,ten,bac,phucap,bac*luong+phucap);
        
        
    }
    
    
}
public class Baitap{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Giaovien a = new Giaovien();
        a.Input(sc);
        a.Output();
    }
    
}

//3
//0 0 0 5 0 199
//1 1 1 1 1 1
//0 0 0 5 5 0