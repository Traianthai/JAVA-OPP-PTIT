package a;


import java.util.Scanner;

public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    
    public void process(){
        String a = sc.next();
        int dem = 0 ;                
        for(int i = 0 ; i < a.length() ; i ++){
            if(a.charAt(i) == '4' || a.charAt(i) == '7') dem++;
        }
        if(dem == 4 || dem == 7) System.out.println("YES");
        else System.out.println("NO");
        
    }
    public static void main(String[] args) {
        Baitap a = new Baitap();
        a.process();
    }
    
}
//3
//1890
//3681
//8919