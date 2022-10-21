package a;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> Ar = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine());
            Ar.add(a);
        }
        Collections.sort(Ar);
        for (SinhVien i : Ar) {
            System.out.println(i);
        }
    }
}
//4
//Nguyen Van Nam
//168 600
//Tran Thi Ngoc
//168 600
//Nguyen Van Nam
//170 171
//Tran Thi Ngoc
//168 171




