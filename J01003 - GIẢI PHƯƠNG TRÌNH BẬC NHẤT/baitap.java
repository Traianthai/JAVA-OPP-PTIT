package a;

import java.util.Scanner;

public class baitap{
    public Scanner sc = new Scanner(System.in);
    
    public void process(){
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if(a == 0 && b == 0){
            System.out.println("VSN");
        }else if(a == 0 && b != 0){
            System.out.println("VN");
        }else{
            System.out.println(String.format("%.2f", -b/a));
        }
    }
    public static void main(String[] args) { 
        baitap e = new baitap();
        e.process();
    }
    
    
}