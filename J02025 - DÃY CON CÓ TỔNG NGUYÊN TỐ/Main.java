
package daycontongnguyento;

import java.util.*;


/**
 *
 * @author ADMIN
 */
public class Main {
    public static int n;
    public static Integer A[] = new Integer[20];
    public static Integer U[] = new Integer[20];
    
    
    public static void Try(int i){
        for (int j = 0; j <= 1; j++) {
            U[i] = j;
            if(i == n-1){
                out();
            }else Try(i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            ArrayList <Integer> Ar = new ArrayList<>();
            for(int i = 0; i < n; i++){
                Ar.add(sc.nextInt());
            }
            Collections.sort(Ar, new Comparator<Integer>(){
                @Override
                public int compare(Integer o1, Integer o2) {
                    if(o1 < o2) return 1;
                    if(o1 > o2) return -1;
                    return 0;
                }
                
            });
            for (int i = 0; i < n; i++) {
                A[i] = Ar.get(i);
            }
            Try(0);
        }
    }

    private static void out() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i]*U[i];
        }
        for(int i = 2 ; i <= Math.sqrt(sum) ; i ++){
            if(sum % i == 0) return;
        }
        if(sum < 2) return;
        for (int i = 0; i < n; i++) {
            if(U[i] == 1) System.out.print(A[i] + " ");
        }
        System.out.println("");
        
    }
}
