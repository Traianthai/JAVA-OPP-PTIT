package a;

import java.math.BigInteger;
import java.util.*;

public class ptit{
    
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        String res = "";
        char top = 'A';
        for (int i = l.length() - 1; i >= 0; i--) {
            if(res.isEmpty()){
                res = l.charAt(i) + res;
                top = l.charAt(i);
            }else{
                if(top <= l.charAt(i)){
                    top = l.charAt(i);
                    res = top + res;
                }
            }
        }
        System.out.println(res);
    }
}

//1
//12
//198111