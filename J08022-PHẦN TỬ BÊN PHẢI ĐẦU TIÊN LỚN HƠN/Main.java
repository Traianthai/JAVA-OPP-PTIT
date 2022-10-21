
package phantudautienlonhonbenphai;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            int a = sc.nextInt();
            int A[] = new int[a+1];
            for (int i = 0; i < a; i++) {
                A[i] = sc.nextInt();
            }
            Stack <Integer> st = new Stack<>();
            int B[] = new int[a+1];
            for (int i = 0; i < a; i++) {
                if(st.empty()){
                    st.push(i);
                }else{
                    while(!st.empty() && A[st.peek()] < A[i]){
                        B[st.pop()] = A[i];
                       
                    }
                    st.push(i);
                }
            }
            while(!st.empty()){
                B[st.pop()] = -1;
            }
            for (int i = 0; i < a; i++) {
                System.out.print(B[i]+ " ");
            }
            System.out.println("");
        }
    }
}


//1 3 4 2 3 6 7
