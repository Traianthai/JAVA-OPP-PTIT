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
public class Data {
    public  ArrayList <Integer> Ar;
    public  int dem;

    public Data(ArrayList<Integer> Ar, int dem) {
        this.Ar = Ar;
        this.dem = dem;
    }
    public boolean check(ArrayList <Integer> Ar1){
        for (int i = 0; i < 6; i++) {
            if(Ar.get(i) != Ar1.get(i)) return false;
        }
        return true;
    }

    
    
}
