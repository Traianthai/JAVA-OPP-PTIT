package a;

import java.util.Scanner;

public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    
    
    public void process(){
        String[] s = sc.nextLine().split("\\s");
        for (String string : s) {
            StringBuilder res = new StringBuilder(string);
            System.out.print(res.reverse() + " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int z = Integer.parseInt(sc.nextLine());
        int t = 1;
        while(t <= z){
            Baitap a = new Baitap();
            a.process();
            t++;
        }
    }
    
}
//2
//ABC DEF
//123 456