
package quayphai;

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
            ArrayList<Integer> Ar1 = new ArrayList<>();
            ArrayList<Integer> Ar2 = new ArrayList<>();
            for (int i = 0; i < a; i++) {
                Ar1.add(sc.nextInt());
                Ar2.add(Ar1.get(i));
            }
            Collections.sort(Ar2);
            for (int i = 0; i < a; i++) {
                if(Ar2.get(0).equals(Ar1.get(i))){
                    System.out.println(i);
                    break;
                }
            }
            
        }
        
    }
}
