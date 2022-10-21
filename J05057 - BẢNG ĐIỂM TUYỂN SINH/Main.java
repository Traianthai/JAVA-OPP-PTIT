package a;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList <ThiSinh> Ar = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            ThiSinh a = new ThiSinh(sc.nextLine(),sc.nextLine().trim(), Float.parseFloat(sc.nextLine()),
                Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            Ar.add(a);
        }
//        Collections.sort(Ar);
        int dem = 1;
        for (ThiSinh i : Ar) {
            System.out.println(i);
        }
    }

}
//2
//KV2A002
//Hoang Thanh Tuan
//5
//6
//5
//KV2B123
//Ly Thi Thu Ha
//8
//6.5
//7




