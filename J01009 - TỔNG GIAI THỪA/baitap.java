package a;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class baitap{
    public Scanner sc = new Scanner(System.in);
    
    public void process(){
        long n = sc.nextLong();
        long sum = 0 ;
        long tmp = 1;
        for(int i = 1 ; i <= n ; i++){
            tmp *= i;
            sum += tmp;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) { 
        baitap e = new baitap();
        e.process();
    }
    
    
}