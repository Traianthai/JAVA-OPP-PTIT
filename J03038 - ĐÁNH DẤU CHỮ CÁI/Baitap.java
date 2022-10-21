package a;

import java.util.Scanner;
import java.util.TreeSet;

public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    
    
    public void process(){
        String s = sc.nextLine();
        TreeSet <String> se = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            se.add(s.substring(i, i+1));
        }
        System.out.println(se.size());
    }
    
    public static void main(String[] args) {
//        int z = Integer.parseInt(sc.nextLine());
//        int t = 1;
//        while(t <= z){
            Baitap a = new Baitap();
            a.process();
//            t++;
//        }
    }
    
}
//3
//12
//100
//1212
//8888
//121212121212121212
//45678978