package a;




import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class Baitap{
    private static Scanner sc = new Scanner(System.in);
   
    public void process(){
        int a = sc.nextInt();
        int A[] = new int[a];
        for (int j = 0; j < a; j++) {
            A[j] = sc.nextInt();
        }
        Stack <Integer> st = new Stack<>();
        int i = 0 ;
        while(i < a){
            if(st.empty()) {
                st.push(A[i]);
            }
            else{
                if((st.peek() + A[i]) % 2 == 0) st.pop();
                else st.push(A[i]);
            }
            i++;
        }
        System.out.println(st.size());
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