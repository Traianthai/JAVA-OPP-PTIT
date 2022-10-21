package a;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList <MatHang> Ar =  new ArrayList<>();
        for (int i = 0; i < t; i++) {
            MatHang a = new MatHang(String.valueOf(i+1),sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()));
            Ar.add(a);
        }
        Collections.sort(Ar);
        for (MatHang i : Ar) {
            System.out.println(i);
        }
    }
}

