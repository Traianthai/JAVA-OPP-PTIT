package a;


import java.util.ArrayList;
import java.util.Collections;
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
        Collections.sort(Ar);
        for (GiangVien i : Ar) {
            System.out.println(i);
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