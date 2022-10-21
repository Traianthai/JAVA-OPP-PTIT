package a;

import java.util.Scanner;

public class baitap{
    public Scanner sc = new Scanner(System.in);
    
    public void process(){
        int z = sc.nextInt();
        while(z-- != 0){
            long a ;
            a = sc.nextLong();
            System.out.println(a*(a+1)/2);
        }
    }
    public static void main(String[] args) { 
        baitap e = new baitap();
        e.process();
    }
    
    
}