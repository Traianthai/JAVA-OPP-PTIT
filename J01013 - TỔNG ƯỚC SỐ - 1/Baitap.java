package a;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    private int maxN = 2000001;
    private int sumDIV[] = new int[maxN];
    private boolean isnotPrime[] = new boolean[maxN];
    public void tongNT(){
        for(int i = 2 ; i * i < maxN ; i ++){
            if(isnotPrime[i] == false){
                for(int j = i*i ; j < maxN ; j+= i){
                    isnotPrime[j] = true;
                }
            }
        }
        for(int i = 2 ; i < maxN ; i ++){
            if(isnotPrime[i] == false){
                for(int j = i ; j < maxN ; j +=i){
                    int tmp = j ;
                    while(tmp % i == 0){
                        sumDIV[j] += i;
                        tmp = tmp / i;
                    }
                }
            }
        }
    }
    public void process(){
        
        int t = sc.nextInt();
        long count = 0;
        for (int i = 1; i <= t; i++) {
            count += sumDIV[sc.nextInt()];
        }
        System.out.println(count);
        
    }
    public static void main(String[] args) {
        Baitap a = new Baitap();
        a.tongNT();
        a.process();
    }
    
}
//3
//1890
//3681
//8919