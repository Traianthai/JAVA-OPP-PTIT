package a;




import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    
    public void process(){
        int n = sc.nextInt();
        int[][] a = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int tmp = sc.nextInt();
                if (j>i && tmp == 1) {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
    }
    
    public static void main(String[] args) {
//        int z =sc.nextInt();
//        int t = 1;
//        while(t <= z){
            Baitap a = new Baitap();
            a.process();
//            t++;
//        }
    }
    
}
