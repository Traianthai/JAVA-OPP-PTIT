package a;


import java.util.Scanner;

/**
 *
 * @author manhz
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            MatHang a = new MatHang(sc.nextLine(), Integer.parseInt(sc.nextLine()));
            System.out.println(a);
        }
    }
}

//3
//A001Y
//1000
//B012N
//2500
//B003Y
//4582




