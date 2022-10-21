package a;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <HocSinh> Ar = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            HocSinh a = new HocSinh("HS" + new DecimalFormat("#00").format(i+1), sc.nextLine(), Float.parseFloat(sc.nextLine()));
            Ar.add(a);
        }
        ArrayList <HocSinh> Ar1 = new ArrayList<>(Ar);
        Collections.sort(Ar);
        int stt = 1;
        float m = Ar.get(0).getDiem();
        for (int i = 0; i < Ar.size(); i++) {
           if(m == Ar.get(i).getDiem()) Ar.get(i).setThuhang(stt);
           else {
               m = Ar.get(i).getDiem();
               stt = i + 1;
               Ar.get(i).setThuhang(stt);
           }
        }
        for (HocSinh i : Ar1) {
            for (HocSinh j : Ar) {
                if(i.getDiem() == j.getDiem()) i.setThuhang(j.getThuhang());
            }
        }
        for (HocSinh i : Ar1) {
            System.out.println(i);
        }
    }
}
//4
//Tran Minh Hieu
//5.9
//Nguyen Bao Trung
//8.6
//Le Hong Ha
//9.2
//Nguyen Bao Trung
//8.6
