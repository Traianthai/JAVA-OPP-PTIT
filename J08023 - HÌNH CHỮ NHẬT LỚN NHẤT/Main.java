package a;
import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Main {
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int s = sc.nextInt();
            int Ar1[] = new int[s+1];
            for (int j = 0; j < s; j++) {
                Ar1[j] = sc.nextInt();
            }
            MaxArea Ma1 = new MaxArea(Ar1,s);
            System.out.println(Ma1.Get_Area());
        }
        
    }
}