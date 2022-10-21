package a;




import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Baitap{
    private static Scanner sc = new Scanner(System.in);
   
    public void process(){
        int a = sc.nextInt();
        int A[] = new int[100];
        for (int i = 0; i < a; i++) {
            A[i] = sc.nextInt();
        }
        int dem = 1 ;
        for (int j = 0; j < a - 1; j++) {
            int ok = 0 ;
            for(int i = 0 ; i < a - 1; i ++){
                if(A[i] > A[i+1]){
                    int tmp = A[i];
                    A[i] = A[i+1];
                    A[i+1] = tmp;
                    ok =1 ;
                }
            }
            if(ok == 1){
                System.out.printf("Buoc %d:",dem++);
                for (int i = 0; i < a; i++) {
                    System.out.print(" " + A[i]);
                }
                System.out.println("");
            }
        }
        
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