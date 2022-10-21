package a;








import java.util.Scanner;
import java.util.Stack;

public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    
    
    public void process(){
        StringBuilder s = new StringBuilder(sc.nextLine());
        int i = 0;
        while (i < s.length() - 1) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                s.delete(i, i + 2);
                i = 0;
            } else {
                i++;
            }
        }
        System.out.println(s.toString().isEmpty() ? "Empty String" : s);
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
//aaabccddd