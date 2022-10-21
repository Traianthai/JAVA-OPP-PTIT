package a;

import java.math.BigInteger;
import java.util.*;

public class ptit{
    
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while( n-- != 0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            System.out.println(a.add(b));
        }
    }
}

//1
//12
//198111