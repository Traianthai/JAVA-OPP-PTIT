package a;







import java.math.BigInteger;
import java.util.Scanner;


public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    
    
    public void process(){
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
        BigInteger c = new BigInteger("0");
        if(a.mod(b).equals(c) || b.mod(a).equals(c)) System.out.println("YES");
        else System.out.println("NO");
        
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
//18 7
//123 3