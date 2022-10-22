/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanma;

/**
 *
 * @author ADMIN
 */
public class Pair {
    public  char a;
    public  int b,dem;
    public String s;

    public Pair(String s, int dem) {
        this.a = s.charAt(0);
        this.b = Integer.parseInt(s.charAt(1)+"");
        this.dem = dem;
        this.s = s;
    }
    
}
