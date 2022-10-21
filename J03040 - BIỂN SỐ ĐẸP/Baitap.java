package a;

import java.util.Scanner;
import java.util.TreeSet;

public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    public boolean check(String res){
        boolean ok1 = true;
        boolean ok2 = true;
        boolean ok3 = true;
        for (int i = 0; i < res.length()-1; i++) {
            if(res.charAt(i)+1 != res.charAt(i+1)) ok1 = false;
            if(res.charAt(i) != res.charAt(i+1)) ok2 = false;
            
        }
        for (int i = 0; i < res.length(); i++) {
            if(res.charAt(i) != '8' && res.charAt(i) != '6') ok3 = false;
        }
        if(ok1 || ok2 || ok3) return true;
        if((res.charAt(0) == res.charAt(1) && res.charAt(0) == res.charAt(2)) && (res.charAt(3) == res.charAt(4)))  return true;
        return false;
    }
    
    public void process(){
        String s = sc.nextLine(); 
        String res = s.substring(5).replace(".", "") ;
       
        if(check(res)) System.out.println("YES");
        else System.out.println("NO");
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
//7
//29T1–123.45
//29T1–555.55
//29T1–222.33
//29T1–686.88
//29T1–123.33
//29T1–555.54
//29T1–606.88