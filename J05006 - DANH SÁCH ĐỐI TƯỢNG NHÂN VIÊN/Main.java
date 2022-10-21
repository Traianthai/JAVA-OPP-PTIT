package a;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList <NhanVien> Ar = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            NhanVien a = new NhanVien(new DecimalFormat("#00000").format(i+1), sc.nextLine(), 
                sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine());
            Ar.add(a);
        }
        for (NhanVien i : Ar) {
            System.out.println(i);
        }
    }
}


