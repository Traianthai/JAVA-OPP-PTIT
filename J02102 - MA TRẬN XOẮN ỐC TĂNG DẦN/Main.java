
package matranxoanoctangdan;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList <Integer> Ar = new ArrayList<>();
        for (int i = 0; i < t*t; i++) {
            Ar.add(sc.nextInt());
        }
       
        Collections.sort(Ar);
        int A[][] = new int[21][21];
        int dem = 0;
        int d = 0;
        int c = t-1;
        while(dem < t*t){
            for (int i = d; i <= c; i++) {
                A[d][i] = Ar.get(dem);
                dem++;
            }
            if(dem == t*t) break;
            for (int i = d+1; i <= c-1; i++) {
                A[i][c] = Ar.get(dem);
                dem++;
            }
            for (int i = c; i >= d; i--) {
                A[c][i] = Ar.get(dem);
                dem++;
            }
            for (int i = c-1; i >= d+1; i--) {
                A[i][d] = Ar.get(dem);
                dem++;
            }
            d++;
            c--;
//            System.out.println(dem);
        }
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                System.out.print(A[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
