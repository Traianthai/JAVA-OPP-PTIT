package a;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        for (int i = 0; i < z; i++) {
            PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo c = a.add(b);
            System.out.println(c.mutil(c) + " " + a.mutil(b).mutil(c.mutil(c)));
        }
    }
}





