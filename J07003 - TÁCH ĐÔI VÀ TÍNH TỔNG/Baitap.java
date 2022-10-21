package a;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;



public class Baitap{
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            String s = sc.nextLine().trim();
            BigInteger num;
            if (s.length() == 1) {
                System.out.println(s);
            } else {
                while (s.length() > 1) {
                    BigInteger l, r;
                    l = new BigInteger(s.substring(0, s.length() / 2));
                    r = new BigInteger(s.substring(s.length() / 2));
                    num = l.add(r);
                    s = num.toString();
                    System.out.println(s);
                }
            }
        }catch(FileNotFoundException e){
            
        }
      
    }
    
    
    
}