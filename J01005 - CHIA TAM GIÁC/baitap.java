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
            int n = sc.nextInt();
            int h = sc.nextInt();
            for(int i = 1 ; i < n ; i ++){
                System.out.print(String.format("%.6f", sqrt((double)i/n)*h)+ " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) { 
        baitap e = new baitap();
        e.process();
    }
    
    
}