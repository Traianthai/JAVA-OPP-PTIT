package a;



import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    public long gcd(long a,long b){
        if(a == 0) return b;
        else return gcd(b%a,a);
    }
    public void process(){
        int a = sc.nextInt();
        long res = 1 ;
        for(int i = 1;  i <= a ; i ++){
            res = (res*i)/gcd(res,i);
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Baitap a = new Baitap();
        int z = sc.nextInt();
        int t = 1 ;
        while(t <= z){
            a.process();
            t++;
        }
    }
    
}
//2
//10
//1 7 2 8 3 3 2 1 3 2
//12
//1 2 3 4 5 6 7 8 9 1 2 3