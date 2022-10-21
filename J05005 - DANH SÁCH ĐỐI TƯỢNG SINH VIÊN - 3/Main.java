package a;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <SinhVien> sv = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            SinhVien a = new SinhVien(i+1, sc.nextLine().trim(), sc.nextLine(),new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine()),Float.parseFloat(sc.nextLine()));
            sv.add(a);
        }
        Collections.sort(sv);
        for (SinhVien i : sv) {
            System.out.println(i);
        }
    }
    
}




