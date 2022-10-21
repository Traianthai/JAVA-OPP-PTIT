package dayngoacdung;



import java.util.*;


/**
 *
 * @author manhz
 */
public class Main {
    public static boolean check(char a,char b){
        if(a == '(' && b == ')') return true;
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc .nextInt();
        for (int i = 0; i < a; i++) {
            String res = sc.next();
            Stack <Integer> st = new Stack<>();
            st.push(-1);
            int max = 0;
            for (int j = 0; j < res.length(); j++) {
                if(st.size() != 1 && check(res.charAt(st.peek()),res.charAt(j))){
                    st.pop();
                    max = Math.max(max, j - st.peek());
                }else{
                    st.push(j);
                }
            }
            System.out.println(max);
        }
    }
}
