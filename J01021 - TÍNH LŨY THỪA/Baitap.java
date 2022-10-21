package a;


import static java.lang.Math.abs;
import java.util.Scanner;

public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    private long MOD = (long)1e9+7;
    public void process(){
        while(true){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a == 0 && b == 0) break;
            long res = 1;
            while(b > 0){
                if(b % 2 != 0) res = res * a % MOD;
                a = a * a % MOD ;
                b = b / 2;
            }
            System.out.println(res);
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