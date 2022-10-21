package a;

import java.util.Scanner;






public class baitap{
    private static Scanner sc = new Scanner(System.in);
    
    public void process(){
        int z = sc.nextInt();
        int k = 1 ;
        while(k <= z){
            int a = sc.nextInt();
            System.out.printf("Test " + (k++) + ": ");
            for(int i = 2 ; i*i <= a ; i ++){
                int dem = 0 ; 
                while(a % i == 0){
                    dem++;
                    a = a / i ;
                }
                if(dem > 0) System.out.printf("%d(%d) ",i,dem );
            }
            
            System.out.println(a > 1 ? a + "(1)":"");
        }
        
        
    }
    public static void main(String[] args) {
        baitap a = new baitap();
        a.process();
    }
    
}