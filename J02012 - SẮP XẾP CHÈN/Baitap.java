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
        ArrayList <Integer> Ar = new ArrayList<>();
        for(int i = 0 ; i < a ; i ++){
            Ar.add(A[i]);
            Collections.sort(Ar);
            System.out.print("Buoc " + i + ": ");
            for (Integer x : Ar) {
                System.out.print(x + " ");
            }
            System.out.println("");
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