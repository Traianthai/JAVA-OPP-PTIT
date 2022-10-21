package a;


import static java.lang.Math.abs;
import java.util.Scanner;

public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    
    public void process(){
        int t = Integer.parseInt(sc.nextLine());
        String tmp = "[0-2]+";
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(s.trim().matches(tmp) ? "YES" : "NO");
        }
    }
    public static void main(String[] args) {
        Baitap a = new Baitap();
        a.process();
    }
    
}
//3
//1890
//3681
//8919