package a;



import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    
    public void process(){
        ArrayList <Integer> A = new ArrayList<>();
        ArrayList <Integer> B = new ArrayList<>();
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < a; i++) {
            A.add(sc.nextInt());
        }
        for (int i = 0; i < b; i++) {
            B.add(sc.nextInt());
        }
//        System.out.println(A);
//        System.out.println(B);
        A.retainAll(B);
        TreeSet <Integer> se = new TreeSet<>(A);
        for(int i : se){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Baitap a = new Baitap();
        a.process();
    }
    
}
//5 6
//1 2 3 5 3
//3 5 3 7 8 4