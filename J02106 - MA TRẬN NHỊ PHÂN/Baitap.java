package a;





import java.util.Scanner;



public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    
    public void process(){
        int n = sc.nextInt();
        int dem = 0 ;
        int a, b, c;
        for(int i = 0 ; i < n ; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if(a+ b + c > 1) dem++;
        }
        System.out.println(dem);
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
