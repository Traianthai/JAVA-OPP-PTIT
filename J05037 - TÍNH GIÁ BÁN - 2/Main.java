package a;


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <MatHang> Ar = new ArrayList<>();
        int a = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < a; i++) {
            MatHang s = new MatHang("MH" + String.format("%02d", i+1),sc.nextLine() , 
                    sc.nextLine(), Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
            Ar.add(s);
            
        }
        Collections.sort(Ar);
        for (MatHang i : Ar) {
            System.out.println(i);
        }
    }
    
}

//4
//DUONG
//KG
//7500
//150
//TRUNG
//CHUC
//10000
//225
//GAO
//KG
//14000
//118
//SUA
//HOP
//48000
//430



