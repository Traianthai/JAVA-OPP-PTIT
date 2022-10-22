
package dayconlientiepbangk;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Main {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        while(z-- != 0){
            int a = sc.nextInt();
            long k = sc.nextLong();
            long Ar[] = new long[a+2];
            long s = 0;
            for (int i = 1; i <= a; i++) {
                Ar[i] = sc.nextLong()+s;
                s = Ar[i];
            }
            int ok = 0;
            for (int i = 0; i < a; i++) {
                if(Arrays.binarySearch(Ar, i+1,a+1,Ar[i] + k) >= 0){
                    ok =1 ;
                    break;
                }
            }
            if(ok == 1) System.out.println("YES");
            else System.out.println("NO");
        }
        
        
    }
}
