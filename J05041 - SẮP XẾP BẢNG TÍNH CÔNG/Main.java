package a;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList <NhanVien> Ar = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            NhanVien a = new NhanVien("NV" + String.format("%02d", i+1), sc.nextLine()
                    , Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
            Ar.add(a);
        }
        Collections.sort(Ar);
        for (NhanVien i : Ar) {
            System.out.println(i);
        }
//        System.out.println("Tong chi phi tien luong: "+tong);
    }
}
//3
//Cao Van Vu
//50000
//26
//GD
//Do Van Truong
//40000
//25
//PGD
//Truong Thi Tu Linh
//45000
//22
//NV




