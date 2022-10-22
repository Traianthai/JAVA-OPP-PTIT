/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xephang;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList <Pair> Ar = new ArrayList<>();
        while(t-- > 0){
            Ar.add(new Pair(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(Ar);
        int sum = Ar.get(0).t + Ar.get(0).d;
        for (int i = 1; i < Ar.size(); i++) {
            if(sum < Ar.get(i).t) sum = Ar.get(i).t + Ar.get(i).d;
            else{
                sum += Ar.get(i).d;
            }
        }
        System.out.println(sum);
    }
}
