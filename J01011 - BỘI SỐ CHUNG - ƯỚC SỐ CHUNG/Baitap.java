package a;

import java.util.Scanner;






public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    public long gcd(long a, long b){
        if(a == 0) return b;
        else return gcd(b%a,a);
    }
    public void process(){
        int z = sc.nextInt();
        while(z-- != 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = gcd(a,b);
            System.out.printf("%d %d\n",a*b/c,c);
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