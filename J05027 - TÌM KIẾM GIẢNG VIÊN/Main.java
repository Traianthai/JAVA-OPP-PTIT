package a;


import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList <GiangVien> Ar = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            GiangVien a = new GiangVien("GV" + String.format("%02d", i+1), sc.nextLine(), sc.nextLine());
            Ar.add(a);
        }
        int e = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < e; i++) {
            String res = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + res + ":");
            for (GiangVien j : Ar) {
                if(j.getName().toLowerCase().contains(res.toLowerCase())) System.out.println(j);
            }
        }
        
    }
}
//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin
//1
//aN