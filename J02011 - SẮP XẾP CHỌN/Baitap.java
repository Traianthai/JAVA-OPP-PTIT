package a;




import java.util.Scanner;


public class Baitap{
    private static Scanner sc = new Scanner(System.in);
   
    public void process(){
        int a = sc.nextInt();
        int A[] = new int[100];
        for (int i = 0; i < a; i++) {
            A[i] = sc.nextInt();
        }
        int dem = 1;
        for(int i = 0 ; i < a - 1; i ++){
            int minid = i ;
            for (int j = i+1; j < a; j++) {
                if(A[minid] > A[j]){
                    minid = j;
                }
            }
            System.out.printf("Buoc %d: ",dem++);
            int tmp = A[i];
            A[i] = A[minid];
            A[minid] = tmp;
            for (int k = 0; k < a; k++) {
                System.out.print(A[k] + " ");
            }
            System.out.println("");
        }
        
    }
    public static void main(String[] args) {
        Baitap a = new Baitap();
        a.process();
    }
    
}
//2
//10
//1 7 2 8 3 3 2 1 3 2
//12
//1 2 3 4 5 6 7 8 9 1 2 3