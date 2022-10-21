package a;

import java.util.Scanner;

public class baitap{
    private Scanner sc = new Scanner(System.in);
    
    public void process(){
        int a,b ;
        a = sc.nextInt();
        b = sc.nextInt();
        if(a <= 0 || b <= 0){
            System.out.println(0);
        }else{
            System.out.print((a+b)*2);
            System.out.print(" ");
            System.out.print(a*b);
        }
        
        
    }
    public static void main(String[] args) {
        baitap e = new baitap();
        e.process();
    }
    
    
}