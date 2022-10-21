package a;







import java.math.BigInteger;
import java.util.Scanner;


public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    
    
    public void process(){
        String a = sc.next();
        String b = sc.next();
        
        BigInteger big1 = new BigInteger(a);
        BigInteger big2 = new BigInteger(b);
        String res = big1.subtract(big2).toString();
        
        System.out.println(res);
    }
    
    public static void main(String[] args) {
//        int z = Integer.parseInt(sc.nextLine());
//        int t = 1;
//        while(t <= z){
            Baitap a = new Baitap();
            a.process();
//            t++;
//        }
    }
    
}
//000123456789012345678901234567890
//00000000000000001234567890
//000123456789012345678901234567890