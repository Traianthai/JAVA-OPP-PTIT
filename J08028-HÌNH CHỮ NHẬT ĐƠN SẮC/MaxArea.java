
package hinhchunhatlonnhat;

import java.util.*;
/**
 *
 * @author ADMIN
 */
public class MaxArea {
    private int A[];
    private int R[];
    private int L[];
    private int s;

    public MaxArea(int A[],int s) {
        this.A = A;
        this.R = new int[s+1];
        this.L = new int[s+1];
        this.s = s;
    }
    
    public  void Set_Right(){
        Stack <Integer> st = new Stack<>();
        for (int i = s-1; i >= 0; i--) {
            while(!st.empty() && A[i] <= A[st.peek()]){
                st.pop();
            }
            if(st.empty()) R[i] = s;
            else R[i] = st.peek();
            st.push(i);
        }
        
    }
    
    public  void Set_Left(){
        Stack <Integer> st = new Stack<>();
        for (int i = 0; i < s; i++) {
            while(!st.empty() && A[i] <= A[st.peek()]){
                st.pop();
            }
            if(st.empty()) L[i] = -1;
            else L[i] = st.peek();
            st.push(i);
        }
        
    }
    
    public long Get_Area(){
        Set_Right();
        Set_Left();
//        for (int i = 0; i < s; i++) {
//            System.out.print(R[i]+" ");
//        }
//        System.out.println("");
//        for (int i = 0; i < s; i++) {
//            System.out.print(L[i]+" ");
//        }
//        System.out.println("");
        
        long Area = 0;
        for (int i = 0; i < s; i++) {
            Area = Math.max(Area, A[i]*(long)(R[i] - L[i] - 1));
        }
        return Area;
    }
}
