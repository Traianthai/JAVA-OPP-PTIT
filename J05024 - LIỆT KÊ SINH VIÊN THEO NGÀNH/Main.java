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
            Ar.add(sc.nextLine().toUpperCase());
        }
        for (String i : Ar) {
            System.out.println("DANH SACH SINH VIEN NGANH " + i + ":");
            if(i.equals("CONG NGHE THONG TIN") || i.equals("AN TOAN THONG TIN")){
                for (SinhVien j : sv) {
                    if(j.getNganh().equals(i) && j.getLop().charAt(0) != 'E') System.out.println(j);
                }
            }else{
                for (SinhVien j : sv) {
                    if(j.getNganh().equals(i)) System.out.println(j);
                }
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
//E15CNPM3
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
//Ke toan
//Cong nghe thong tin




