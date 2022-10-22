
package khoangcachnhohonk;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int k = sc.nextInt();
            ArrayList <Integer> Ar = new ArrayList<>();
            for (int i = 0; i < a; i++) {
                Ar.add(sc.nextInt());
            }
            long dem = 0;
            Collections.sort(Ar);
            
            for (int i = 0; i < a; i++) {
                int res = -1;
                int l = i+1,r = a-1;
                while(l <= r){
                    int mid = (r+l)/2;
                    if(Ar.get(mid) < k + Ar.get(i)){
                        res = mid;
                        l = mid + 1;
                    }else{
                        r = mid -1;
                    }
                }
                if(res != -1) dem += (long) (res-i);
            }
            System.out.println(dem);
        }
        
    }
}
