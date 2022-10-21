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
            ThiSinh a = new ThiSinh(String.valueOf(i+1),sc.nextLine().trim(), sc.nextLine(), Float.parseFloat(sc.nextLine()),
                Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            Ar.add(a);
        }
        Collections.sort(Ar);
        float max = Ar.get(0).tong();
        for (ThiSinh i : Ar) {
            if(i.tong() == max) System.out.println(i);
        }
    }

}
//3
//Nguyen Van A
//12/12/1994
//3.5
//7.0
//5.5
//Nguyen Van B
//1/9/1994
//7.5
//9.5
//9.5
//Nguyen Van C
//6/7/1994
//8.5
//9.5
//8.5



