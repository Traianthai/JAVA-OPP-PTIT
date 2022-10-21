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
                    , sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            Ar.add(a);
        }
        String res = sc.nextLine();
        for (NhanVien i : Ar) {
            if(res.equals(i.getCv())) System.out.println(i);
        }
//        System.out.println("Tong chi phi tien luong: "+tong);
    }
}
//4
//Tran Thi Yen
//NV
//1000
//24
//Nguyen Van Thanh
//BV
//1000
//30
//Doan Truong An
//TP
//3000
//25
//Le Thanh
//GD
//5000
//28
//TP




