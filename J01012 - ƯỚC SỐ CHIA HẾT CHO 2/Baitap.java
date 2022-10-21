package a;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    
    public void process(){
        int z = sc.nextInt();
        while(z-- != 0){
            long n = sc.nextLong();
            if(n % 2 != 0){
                System.out.println("0");
                continue;
            }else if(n == 2){
                System.out.println("1");
                continue;
            }
            int sum = 1;
            int sum_le = 1 ;
            for(int i = 2 ; i * i <= n ; i ++){
                int so_mu = 0;
                while(n % i == 0){
                    so_mu ++;
                    n = n /i ;
                }
                sum = sum * (so_mu + 1);
                if(i != 2) sum_le = sum_le * (so_mu + 1);
            }
            if(n > 1) {
                sum_le = sum_le * 2;
                sum = sum * 2 ;
            }
//            System.out.println(sum + " " + sum_le);
            System.out.println(sum  - sum_le);
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