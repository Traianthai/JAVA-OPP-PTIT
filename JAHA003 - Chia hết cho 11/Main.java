/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chiahetcho11;

import java.math.BigInteger;
import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            BigInteger A = new BigInteger(sc.next());
            if(A.mod(new BigInteger("11")).equals(new BigInteger("0"))) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
