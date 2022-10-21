package a;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <DoanhNghiep> Ar = new ArrayList <>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            DoanhNghiep a = new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            Ar.add(a);
        }
        Collections.sort(Ar);
        for (DoanhNghiep i : Ar) {
            System.out.println(i);
        }
    }
}

//5
//VIETTEL
//TAP DOAN VIEN THONG QUAN DOI VIETTEL
//40
//FSOFT
//CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
//300
//VNPT
//TAP DOAN BUU CHINH VIEN THONG VIET NAM
//200
//SUN
//SUN*
//50
//VIETTEL
//TAP DOAN VIEN THONG QUAN DOI VIETTEL
//300