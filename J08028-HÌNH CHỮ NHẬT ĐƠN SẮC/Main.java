
package hinhchunhatlonnhat;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Main {
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int s = sc.nextInt();
        int Ar1[] = new int[s+1];
        int Ar2[] = new int[s+1];
        for (int i = 0; i < s; i++) {
            int res = sc.nextInt();
            Ar1[i] = res;
            Ar2[i] = len-res;
        }
        MaxArea Ma1 = new MaxArea(Ar1,s);
        
        MaxArea Ma2 = new MaxArea(Ar2,s);
//        for (int i = 0; i < s; i++) {
//            System.out.print(Ar2[i] + " ");
//        }
//        System.out.println("");
        
        System.out.println(Math.max(Ma1.Get_Area(), Ma2.Get_Area()));
    }
}
