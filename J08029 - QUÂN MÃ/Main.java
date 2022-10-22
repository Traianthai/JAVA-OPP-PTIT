/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanma;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        int X[] = {-2,-1,1,2,2,1,-1,-2};
        int Y[] = {1,2,2,1,-1,-2,-2,-1};
        while(t-- != 0){
            String s1 = sc.next();
            String s2 = sc.next();
            Stack <String> st = new Stack<>();
            Queue <Pair> qe = new LinkedList<>();
            qe.add(new Pair(s1, 0));
            st.add(s1);
            while(!qe.isEmpty()){
                Pair top = qe.poll(); // lay dau va xoa
                char a = top.a;
                int b = top.b;
                int dem = top.dem;
                if(top.s.equals(s2)){
                    System.out.println(dem);
                    break;
                }
                for (int i = 0; i < 8; i++) {
                    char x = (char) (a+X[i]);
                    int y = b + Y[i];
                    if(x >= 'a' && y >= 1 && x <= 'h' && y <= 8){
                        String tmp = String.valueOf(x) + String.valueOf(y);
                        if(!st.contains(tmp)){
                            qe.add(new Pair(tmp, dem+1));
                            st.add(tmp);
                        }
                    }
                }
            }
            
        }
    }
}
//9
//e2 e4
//a1 b2
//b2 c3
//a1 h8
//a1 h7
//h8 a1
//b1 c3
//f6 f6
//b1 c3