package a;




import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    private int A[] = new int[11];
    private int n,k, dem;
    
    public void out(){
        for (int i = 1; i <= k; i++) {
            System.out.print(A[i]);
        }
        System.out.print(" ");
        dem++;
    }
    
    public void Try(int i){
        for(int j = A[i-1] + 1 ; j <= n ; j++){
            A[i] = j;
            if(i == k) out();
            else    Try(i+1);
        }
        
    }
    
    
    public void process(){
        n = sc.nextInt();
        k = sc.nextInt();
        Try(1);
        System.out.println("");
        System.out.printf("Tong cong co %d to hop",dem);
    }
    
    public static void main(String[] args) {
        Baitap a = new Baitap();
        a.process();
    }
    
}
//2
//10
//1 7 2 8 3 3 2 1 3 2
//12
//1 2 3 4 5 6 7 8 9 1 2 3