package a;




import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Baitap{
    private static Scanner sc = new Scanner(System.in);
   
    public void process(){
        int a = sc.nextInt();
        int A[] = new int[a];
        int left = 0;
        int right = 0;
        for (int i = 0; i < a; i++) {
            A[i] = sc.nextInt();
            right += A[i];
        }
        int ok = 0;
        int pos = -2;
        for(int i = 0 ; i < a ; i ++){
            right -= A[i];
            if(left == right){
               ok = 1;
               pos = i;
               break;
            }
            left += A[i];
        }
        System.out.println(pos+1);
    }
    public static void main(String[] args) {
        Baitap a = new Baitap();
        int z = sc.nextInt();
        while(z-- != 0){
            a.process();
        }
      
    }
    
}
//2
//10
//1 7 2 8 3 3 2 1 3 2
//12
//1 2 3 4 5 6 7 8 9 1 2 3