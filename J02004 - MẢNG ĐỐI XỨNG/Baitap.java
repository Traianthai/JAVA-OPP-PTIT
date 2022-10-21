package a;



import java.util.Scanner;

public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    public boolean check(int A[],int a){
        for(int i = 0 ; i < a/2 ; i ++){
            if(A[i] != A[a-i-1]) return false;
        }
        return true;
    }
    public void process(){
        int z = sc.nextInt();
        while(z-- != 0){
            int a = sc.nextInt();
            int A[] = new int[100];
            for (int i = 0; i < a; i++) {
                A[i] = sc.nextInt();
            }
            if(check(A,a)) System.out.println("YES");
            else System.out.println("NO");
        }
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