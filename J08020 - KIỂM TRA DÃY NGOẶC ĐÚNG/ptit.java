package sss;

import java.util.*;



public class ptit {
    
    public static boolean check(char x,char y){
        if(x  == '{' && y == '}') return true;
        if(x  == '[' && y == ']') return true;
        if(x  == '(' && y == ')') return true;
        return false;

    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            String res = sc.next();
            Stack <Character> st = new Stack<>();
            for (int i = 0; i < res.length(); i++) {
                if(!st.empty() && check(st.peek(),res.charAt(i))){
                    st.pop();
                }else{
                    st.push(res.charAt(i));
                }
            }
            if(st.empty()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

//2
//[()]{}{[()()]()}
//[(])