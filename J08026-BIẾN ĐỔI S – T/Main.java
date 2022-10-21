/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biendoiST;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        while(z-- != 0){
            int s = sc.nextInt();
            int t = sc.nextInt();
            Queue <Pair> qe = new LinkedList<>();
            TreeSet <Integer> se = new TreeSet<>();
            qe.add(new Pair(s, 0));
            se.add(s);
            while(!qe.isEmpty()){
                Pair tmp = qe.poll();
                if(tmp.a == t){
                    System.out.println(tmp.b);
                    break;
                }
                if(tmp.a < t && se.contains(tmp.a*2) == false) {
                    qe.add(new Pair(tmp.a*2, tmp.b+1));
                    se.add(tmp.a*2);
                }
                if(tmp.a > 1 && se.contains(tmp.a-1) == false) {
                    qe.add(new Pair(tmp.a-1, tmp.b+1));
                    se.add(tmp.a-1);
                }
            }
        }
    }
}
