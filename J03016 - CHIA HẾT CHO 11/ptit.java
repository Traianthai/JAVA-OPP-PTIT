package a;

import java.math.BigInteger;
import java.util.*;

public class ptit{
    
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while( n-- != 0){
            BigInteger a = new BigInteger("11");
            BigInteger b = new BigInteger(sc.next());
            if(b.mod(a).equals(new BigInteger("0"))) System.out.println("1");
            else System.out.println("0");
        }
    }
}

//1
//12
//198111