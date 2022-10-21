package a;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

class Time{
    public  int h,m,s;

    public Time() {
        h = m = s = 0;
    }

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }
    public void Input(Scanner sc){
        h = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt();
    }
    public void Output(){
        System.out.println(h + " " + m +" " + s);
    }
    
    
}
public class Baitap{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Vector<Time> v = new Vector<Time>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Time x = new Time();
            x.Input(sc);
            v.add(x);
        }
        
        Collections.sort(v, new Comparator<Time>() {
            @Override
            public int compare(Time a, Time b) {
                if (a.h == b.h) {
                    if (a.m == b.m) {
                        if (a.s > b.s)
                            return 1;
                        else
                            return -1;
                    } else if (a.m > b.m)
                        return 1;
                    else
                        return -1;
                } else if (a.h > b.h)
                    return 1;
                else
                    return -1;
            }
        });
        for (int i = 0; i < n; i++)
            v.get(i).Output();
    }
    
}

//3
//0 0 0 5 0 199
//1 1 1 1 1 1
//0 0 0 5 5 0