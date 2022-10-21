package a;

import java.util.Scanner;

public class J02007 {
    
    
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j=0;j<t;j++){
            System.out.printf("Test %d:\n",j+1);
            int n = sc.nextInt();
            int []a = new int[n+1];
            int []b = new int[100001];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                b[a[i]]++;
            }
            for (int i=0;i<n;i++){
                if(b[a[i]]>0){
                    System.out.printf("%d xuat hien %d lan\n",a[i],b[a[i]]);
                    b[a[i]]=0;
                }
            }
        }
    }
}