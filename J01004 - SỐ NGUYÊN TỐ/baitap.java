package a;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class baitap{
    public Scanner sc = new Scanner(System.in);
    public boolean check(long a){
        if(a % 2 == 0) return false;
        for(int i = 3 ; i <= sqrt(a) ; i +=2){
            if(a % i == 0) return false;
        }
        
        return true;
    }
    
    
    public void process(){
        int z = sc.nextInt();
        while(z-- != 0){
            long a = sc.nextLong();
            if(check(a)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static void main(String[] args) { 
        baitap e = new baitap();
        e.process();
    }
    
    
}