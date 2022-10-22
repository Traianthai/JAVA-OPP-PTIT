/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pytago;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int s = sc.nextInt();
            ArrayList<Long> Ar = new ArrayList<>();
            for (int i = 0; i < s; i++) {
                long sq = sc.nextLong();
                Ar.add(sq*sq);
            }
            Collections.sort(Ar);
            int ok = 1;
            process : for (int i = 2; i < Ar.size(); i++) {
                int l = 0,r = i - 1;
                while(l < r){
                    if(Ar.get(l) + Ar.get(r) == Ar.get(i)){
                        System.out.println("YES");
                        ok = 0;
                        break process;
                    }else if(Ar.get(l) + Ar.get(r) > Ar.get(i)){
                        r--;
                    }else l++;
                }
            }
            if(ok == 1) System.out.println("NO");
        }
    }
}
