package a;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        ArrayList <SinhVien> sv = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            SinhVien a = new SinhVien( sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine());
            sv.add(a);
        }
        int z = Integer.parseInt(sc.nextLine());
        ArrayList<String> Ar = new ArrayList<>();
        for (int i = 0; i < z; i++) {
            Ar.add(sc.nextLine());
        }
        for (String i : Ar) {
            System.out.println("DANH SACH SINH VIEN LOP " + i + ":");
            for (SinhVien j : sv) {
                if(j.getLop().equals(i)) System.out.println(j);
            }
        }
    }
    
}
//4
//B16DCCN011
//Nguyen Trong Duc Anh
//D16CNPM1
//sv1@stu.ptit.edu.vn
//B15DCCN215
//To Ngoc Hieu
//D15CNPM3
//sv2@stu.ptit.edu.vn
//B15DCKT150
//Nguyen Ngoc Son
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//Nguyen Trong Tung
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
//2
//D15CQKT02-B
//D16CNPM1




