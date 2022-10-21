package a;


import static java.lang.Math.abs;
import java.util.Scanner;

public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    public boolean check(String a){
        for (int i = 1; i < a.length(); i++) {
            if(abs(a.charAt(i)-a.charAt(i-1)) != 2) return false;
        }
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            sum += a.charAt(i)-'0';
        }
        if(sum %10 != 0) return false;
        return true;
    }
    public void process(){
        int z = sc.nextInt();
        while(z-- != 0){
            String a = sc.next();
            int dem = 0 ;                
            if(check(a)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Baitap a = new Baitap();
        a.process();
    }
    
}
//3
//1890
//3681
//8919