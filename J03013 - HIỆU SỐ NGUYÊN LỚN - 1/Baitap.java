package a;







import java.math.BigInteger;
import java.util.Scanner;


public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    
    
    public void process(){
        String a = sc.next();
        String b = sc.next();
        int len = Math.max(a.length(),b.length());
        BigInteger big1 = new BigInteger(a);
        BigInteger big2 = new BigInteger(b);
        String res = big1.subtract(big2).abs().toString();
        while (res.length() < len) {
            res = "0" + res;
        }
        System.out.println(res);
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
//4
//978
//12977
//100
//1000000
//333
//0
//0
//0

