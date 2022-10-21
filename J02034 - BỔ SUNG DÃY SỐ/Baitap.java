package a;




import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    
    
    
    public void process(){
        ArrayList <Integer> Ar = new ArrayList<>();
        int a =sc.nextInt();
        for (int i = 0; i < a; i++) {
            Ar.add(sc.nextInt());
        }
        int ok = 0;
        for (int i = 1; i < Ar.get(a-1); i++) {
            if(!Ar.contains(i)) {
                System.out.println(i);
                ok =1;
            }
        }
        if(ok == 0) System.out.println("Excellent!");
    }
    
    public static void main(String[] args) {
//        int z =sc.nextInt();
//        while(z-- != 0){
            Baitap a = new Baitap();
            a.process();
//        }
    }
    
}
//2
//10
//1 7 2 8 3 3 2 1 3 2
//12
//1 2 3 4 5 6 7 8 9 1 2 3