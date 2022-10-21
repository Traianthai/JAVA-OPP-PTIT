package a;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class baitap{
    public Scanner sc = new Scanner(System.in);
    
    
    
    public void process(){
        int z = sc.nextInt();
        while(z-- != 0){
            int n = sc.nextInt();
            long f0 = 0;
            long f1 = 1;
            long fn = 1;
            for(int i = 3 ; i <= n ; i ++){
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
            System.out.println(fn);
        }
    }
    public static void main(String[] args) { 
        baitap e = new baitap();
        e.process();
    }
    
    
}