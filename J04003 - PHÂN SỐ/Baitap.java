package a;

import java.util.Scanner;

class Fraction {
        long numerator;
        long denominator;
        static Scanner sc = new Scanner(System.in);

        void Input() {
            numerator = sc.nextLong();
            denominator = sc.nextLong();
        }

        void Output() {
            System.out.printf("%d/%d", numerator, denominator);
        }

        void Compact() {
            Long a = numerator;
            Long b = denominator;
            while (a != 0) {
                Long x = a;
                a = b % a;
                b = x;
            }
            numerator /= b;
            denominator /= b;
        }
    }

public class Baitap{
    public static void main(String[] args) {
        Fraction a = new Fraction();
        a.Input();
        a.Compact();
        a.Output();
    }
    
}
//7
//29T1–123.45
//29T1–555.55
//29T1–222.33
//29T1–686.88
//29T1–123.33
//29T1–555.54
//29T1–606.88