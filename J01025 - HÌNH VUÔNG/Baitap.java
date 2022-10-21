package a;


import static java.lang.Integer.max;
import static java.lang.Integer.min;
import static java.lang.Math.abs;
import java.util.Scanner;

public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    
    public void process(){
        int a,b,mina,minb,maxa,maxb;
        mina = minb = Integer.MAX_VALUE;
        maxa = maxb = Integer.MIN_VALUE;
        for(int i = 0 ; i < 4 ; i ++){
            a = sc.nextInt();
            b = sc.nextInt();
            mina = min(a,mina);
            minb = min(b,minb);
            maxa = max(a,maxa);
            maxb = max(b,maxb);
        }
        int res = max((maxa - mina), (maxb - minb));
        System.out.println(res * res);
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