package aa;

import java.util.*;



public class ptit {
    public static long getPairCount(int A[],int n, int sum){
        HashMap <Integer,Integer> Hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(Hm.containsKey(A[i])){
                Hm.put(A[i], Hm.get(A[i]) + 1);
            }else{
                Hm.put(A[i], 1);
            }
            
        }
        long dem = 0;
        for (int i = 0; i < n; i++) {
            if(Hm.get(sum -A[i]) != null){
                dem += Hm.get(sum-A[i]);
            }
            if(sum  - A[i] == A[i]){
                dem --;
            }
        }
        return dem/2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int A[] = new int[n+1];
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
            System.out.println(getPairCount(A, n, k));
        }
    }
}

