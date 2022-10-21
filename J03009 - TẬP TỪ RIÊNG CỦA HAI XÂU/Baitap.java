package a;





import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;



public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    
    
    public void process(){
        String[] s1 = sc.nextLine().split("\\s");
        String[] s2 = sc.nextLine().split("\\s");
        TreeSet <String> s3 = new TreeSet<>();
        TreeSet <String> s4 = new TreeSet<>();
        
        s3.addAll(Arrays.asList(s1));
        s4.addAll(Arrays.asList(s2));
        for (String i : s3) {
            if(!s4.contains(i)) System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int z = Integer.parseInt(sc.nextLine());
        int t = 1;
        while(t <= z){
            Baitap a = new Baitap();
            a.process();
            t++;
        }
    }
    
}

//2
//abc ab ab ab abcd
//ab abc
//aaa xyz ab zzz abc dd dd abc
//xyz dd ttt sas cdc