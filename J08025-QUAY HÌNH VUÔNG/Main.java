/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quayhinhvuong;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            ArrayList <Integer> Ar1 = new ArrayList<>();
            ArrayList <Integer> Ar2 = new ArrayList<>();
            for (int i = 0; i < 6; i++) {
                Ar1.add(sc.nextInt());
            }
            for (int i = 0; i < 6; i++) {
                Ar2.add(sc.nextInt());
            }
            Queue <Data> qe= new LinkedList<>();
            qe.add(new Data(Ar1,0));
            
            while(qe.size() != 0){
                Data tmp = qe.poll();
                if(tmp.check(Ar2)) {
                    System.out.println(tmp.dem);
                    break;
                }
                // trai
                ArrayList <Integer> L = new ArrayList<>(tmp.Ar);
                L.set(0, tmp.Ar.get(3));
                L.set(1, tmp.Ar.get(0));
                L.set(3, tmp.Ar.get(4));
                L.set(4, tmp.Ar.get(1));
                qe.add(new Data(L,tmp.dem+1));
                // phai
                ArrayList <Integer> R = new ArrayList<>(tmp.Ar);
                R.set(1, tmp.Ar.get(4));
                R.set(2, tmp.Ar.get(1));
                R.set(4, tmp.Ar.get(5));
                R.set(5, tmp.Ar.get(2));
                qe.add(new Data(R,tmp.dem+1));
                
            }
        }
    }
}
