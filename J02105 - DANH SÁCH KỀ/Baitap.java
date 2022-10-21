package a;




import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    
    public void process(){
        int n = sc.nextInt();
        int[][] a = new int[n+1][n];
        for (int i = 1; i <= n; i++) {
            List<Integer> b = new ArrayList<>();
            for (int j = 1; j <= n; j++) {
                int tmp = sc.nextInt();
                if (tmp == 1) {
                    b.add(j);
                }
            }
            System.out.print("List(" + i + ") = ");
            b.forEach(j -> System.out.print(j + " "));
            System.out.println();
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
