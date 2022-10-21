package a;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class baitap{
    public Scanner sc = new Scanner(System.in);
    
    public boolean check(long n){
        if(n <= 3) return true;
        else{
            long f0 = 0;
            long f1 = 1;
            long fn = 1;
            while(fn < n){
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
            return fn == n;
        }
        
    }
    
    public void process(){
        int z = sc.nextInt();
        while(z-- != 0){
            long n = sc.nextLong();
            if(check(n)) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
    public static void main(String[] args) { 
        baitap e = new baitap();
        e.process();
    }
    
    
}