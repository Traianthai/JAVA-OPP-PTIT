package a;







import java.math.BigInteger;
import java.util.Scanner;


public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    
    
    public void process(){
        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());
        System.out.println(a.gcd(b));
        
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
//1
//1221
//1234567891011121314151617181920212223242526272829

