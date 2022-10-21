package a;


import static java.lang.Math.abs;
import java.util.Scanner;

public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    private long Fi[] = new long[100]; 
    public void fibo(){
        Fi[1] = 1;
        Fi[2] = 1;
        for(int i = 3 ; i <= 93 ; i ++){
            Fi[i] = Fi[i-2] + Fi[i-1];
        }
    }
    public char Try(int n, long k){
        if(n == 1) return '0';
        else if(n == 2) return '1';
        else {
            if(k > Fi[n-2]) return Try(n-1,k - Fi[n-2]);
            else return Try(n-2,k);
        }
    }
    public void process(){
        int z = sc.nextInt();
        while(z-- != 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(Try(n,k));
        }
    }
    public static void main(String[] args) {
        Baitap a = new Baitap();
        a.fibo();
        a.process();
    }
    
}
//3
//1890
//3681
//8919