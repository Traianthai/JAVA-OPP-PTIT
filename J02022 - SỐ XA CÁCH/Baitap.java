package a;




import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    private int A[] = new int[11];
    private int n,ok = 0;
    private boolean U[] = new boolean[11];
    public boolean check(){
        for (int i = 1; i < n; i++) {
            if(Math.abs(A[i]-A[i+1]) == 1) return false;
        }
        return true;
    }
    
    
    public void out(){
        if(!check()) return;
        for (int i = 1; i <= n; i++) {
            System.out.print(A[i]);
        }
        System.out.println("");
        ok = 1;
    }
    
    public void Try(int i){
        for(int j = 1 ; j <= n ; j++){
            if(!U[j]){
                A[i] = j;
                U[j] = true;
                if(i == n) out();
                else Try(i+1);
                U[j] = false;
            }
        }
        
    }
    
    
    public void process(){
        n = sc.nextInt();
        Try(1);
        if(ok == 0)System.out.println("");
    }
    
    public static void main(String[] args) {
        int z =sc.nextInt();
        while(z-- != 0){
            Baitap a = new Baitap();
            a.process();
        }
    }
    
}
//2
//10
//1 7 2 8 3 3 2 1 3 2
//12
//1 2 3 4 5 6 7 8 9 1 2 3