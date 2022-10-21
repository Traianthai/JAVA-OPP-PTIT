package a;

import java.util.*;



public class ptit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int A[] = new int[t+1];
        for (int i = 0; i < t-1; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            A[x]++;
            A[y]++;
        }
        int ok = 0;
        for (int i = 0; i < t; i++) {
            if(A[i] == t-1) ok =1;
        }
        if(ok == 1) System.out.println("Yes");
        else System.out.println("No");
    }
}

