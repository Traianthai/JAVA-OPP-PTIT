package a;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tong = 0;
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            NhanVien a = new NhanVien("NV" + String.format("%02d", i+1), sc.nextLine()
                    , Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
            tong += a.getThucLinh();
            System.out.println(a);
        }
//        System.out.println("Tong chi phi tien luong: "+tong);
    }
}
//3
//Cao Van Vu
//50000
//26
//GD
//Do Van Truong
//40000
//25
//PGD
//Truong Thi Tu Linh
//45000
//22
//NV




