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
            String res = "";
            String tmp = sc.nextLine();
            String d[] = tmp.split("\\s+");
            for (String j : d) {
                res += j.substring(0, 1).toUpperCase();
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + res + ":");
            for (GiangVien j : Ar) {
                if(j.getBomon().equals(res)) System.out.println(j);
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
//2
//Cong nghe phan mem
//An toan thong tin