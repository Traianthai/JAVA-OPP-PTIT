package a;

import java.math.BigInteger;
import java.util.Scanner;

public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    
    
    public void process(){
        BigInteger s1 = new BigInteger(sc.nextLine());
        BigInteger s2 = new BigInteger(sc.nextLine());
        BigInteger a = s1.gcd(s2);
        BigInteger b = s1.multiply(s2);
        System.out.println(b.divide(a));
        
    }
    
    public static void main(String[] args) {
        int z = Integer.parseInt(sc.nextLine());
        int t = 1;
        while(t <= z){
            Baitap a = new Baitap();
            a.process();
            t++;
        }
    }
    
}
//3
//12
//100
//1212
//8888
//121212121212121212
//45678978