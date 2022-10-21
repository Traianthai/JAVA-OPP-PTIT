package a;




import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    
    public void process(int t){
        System.out.println("Test " + t + ":");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int[][] b = new int[m][n]; 
        int res[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
                b[j][i] = a[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int z =sc.nextInt();
        int t = 1;
        while(t <= z){
            Baitap a = new Baitap();
            a.process(t);
            t++;
        }
    }
    
}
