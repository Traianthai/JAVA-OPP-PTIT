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
            ThiSinh a = new ThiSinh(sc.nextLine(),sc.nextLine().trim(), sc.nextLine(), Float.parseFloat(sc.nextLine()),
                Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            Ar.add(a);
        }
        Collections.sort(Ar);
        int dem = 1;
        for (ThiSinh i : Ar) {
            System.out.println(String.valueOf(dem++)+ " " + i);
        }
    }

}
//3
//B20DCCN999
//Nguyen Van An
//D20CQCN04-B
//10.0
//9.0
//8.0
//B20DCAT001
//Le Van Nam
//D20CQAT02-B
//6.0
//6.0
//4.0
//B20DCCN111
//Tran Hoa Binh
//D20CQCN04-B
//9.0
//5.0
//6.0


