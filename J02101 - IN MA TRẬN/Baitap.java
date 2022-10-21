package a;




import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    
    public void process(){
        int n = sc.nextInt();
        ArrayList <Integer> Ar =  new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int A[] = new int[101];
            for (int j = 0; j < n; j++) {
                A[j] = sc.nextInt();
            }
            if(i % 2 == 1){
                for (int j = 0; j < n; j++) {
                    Ar.add(A[n-1-j]);
                }
            }else{
                for (int j = 0; j < n; j++) {
                    Ar.add(A[j]);
                }
            }
        }
        for (Integer x : Ar) {
            System.out.print(x+ " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int z =sc.nextInt();
        while(z-- != 0){
            Baitap a = new Baitap();
            a.process();
        }
    }
    
}
