
package Lauchonthamlam;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int Max[] = new int[n+1];
        int Min[] = new int[n+1];
        Max[0] = 1;
        Min[0] = 1;
        String max = "";
        String min = "";
        int sum1 = s-1;
        
        for (int i = 0; i < n; i++) {
            while(Max[i] < 9){
                Max[i]++;
                sum1--;
                if(sum1 == 0) break;
            }
            if(sum1 == 0) break;
        }
        int sum2 = s-1;
        for (int i = n-1; i >= 0; i--) {
            while(Min[i] < 9){
                Min[i]++;
                sum2--;
                if(sum2 == 0) break;
            }
            if(sum2 == 0) break;
        }
        for (int i = 0; i < n; i++) {
            max += String.valueOf(Max[i]);
        }
        for (int i = 0; i < n; i++) {
            min += String.valueOf(Min[i]);
        }
        if(sum1 != 0 || sum2 != 0) System.out.println("-1 -1");
        else System.out.println(min + " " + max);
    }
}
