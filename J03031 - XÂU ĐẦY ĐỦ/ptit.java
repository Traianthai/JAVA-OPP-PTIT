package a;

import java.util.*;

public class ptit{
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            sc.nextLine();
            String s = sc.next();
            int k = sc.nextInt();
            HashSet<Character> kt = new HashSet<Character>();
            for (int i = 0; i < s.length(); i++) {
                kt.add(s.charAt(i));
            }
            System.out.println(kt.size() + k >= 26 ? "YES" : "NO");
        }
    }
}

//3
//XIX
//DC
//CD