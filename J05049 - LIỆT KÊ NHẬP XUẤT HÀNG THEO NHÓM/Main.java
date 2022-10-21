package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author manhz
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList <MatHang> Ar = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            MatHang a = new MatHang(sc.nextLine(), Integer.parseInt(sc.nextLine()));
            Ar.add(a);
        }
        Collections.sort(Ar);
        String res = sc.nextLine();
        for (MatHang i : Ar) {
            if(i.getId().contains(res)) System.out.println(i);
        }
    }
}

//3
//A001Y
//1000
//B012N
//2500
//B003Y
//4582
//B




