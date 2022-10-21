package a;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList <MatHang> Ar =  new ArrayList<>();
        HashMap <String,Integer> mp = new HashMap<>();
        for (int i = 0; i < t; i++) {
            String tmp = sc.nextLine();
            String d[] = tmp.split("\\s+");
            String res = "";
            res += d[0].substring(0,1).toUpperCase();
            res += d[1].substring(0,1).toUpperCase();
            int dem = 0;
            if(mp.containsKey(res)){
                dem = mp.get(res);
                dem ++;
            }else{
                dem = 1;
            }
            mp.put(res, dem);
            MatHang a = new MatHang("0" + dem,tmp,Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
            Ar.add(a);
        }
        Collections.sort(Ar);
        for (MatHang i : Ar) {
            System.out.println(i);
        }
    }
}

//4
//May lanh SANYO
//12
//4000000
//Dien thoai Samsung
//30
//3230000
//Dien thoai Nokia
//18
//1240000
//Dien thoai Nokia
//1
//1240000




