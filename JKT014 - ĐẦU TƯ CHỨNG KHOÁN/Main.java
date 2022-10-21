package a;
import java.util.*;

public class Main {
    public final static Scanner sc = new Scanner(System.in);

    
    public static void main(String[] args) {
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            int a = sc.nextInt();
            int A[] = new int[a+2];
            A[0] = Integer.MAX_VALUE;
            for (int i = 1; i <= a; i++) {
                A[i] = sc.nextInt();
            }
            Stack<Integer> st = new Stack<>();
            st.push(0);
            for (int i = 1; i <= a; i++) {
                while(A[i] >= A[st.peek()]) st.pop();
                System.out.print((i-st.peek()) + " ");
                st.push(i);
            }
            System.out.println("");
        }
    }
}