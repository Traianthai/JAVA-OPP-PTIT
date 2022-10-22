package dayconcokphantu;



import java.util.*;


/**
 *
 * @author ADMIN
 */
public class Main {
    public static int n,k;
    public static Integer A[] = new Integer[20];
    public static Integer U[] = new Integer[20];
    public static Integer I[] = new Integer[20];
    
    private static void out() {

        for (int i = 1; i <= k; i++) {
            System.out.print(A[I[i]-1] + " ");
        }
        System.out.println("");
        
    } 
    
    public static void Try(int i){
        for (int j = I[i-1]+1; j <= n-k+i; j++) {
            I[i] = j;
            if(i == k){
                out();
            }else Try(i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            k = sc.nextInt();
            ArrayList <Integer> Ar = new ArrayList<>();
            for(int i = 0; i < n; i++){
                Ar.add(sc.nextInt());
            }
            Collections.sort(Ar);
            for (int i = 0; i < n; i++) {
                A[i] = Ar.get(i);
            }
            I[0] = 0;
            Try(1);

        }
    }

    
}
