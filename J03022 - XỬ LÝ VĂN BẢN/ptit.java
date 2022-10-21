package a;

import java.io.FileNotFoundException;
import java.util.*;

public class ptit{
    public boolean check(String a){
        int l = a.length();
        for (int i = 0; i <= l/2; i++) {
            if(a.charAt(i) != a.charAt(l-1-i)) return false;
        }
        return true;
    }
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        ptit PTIT = new ptit();
        int len = 0;
        String res = "";
        while(sc.hasNext()){
            String tmp = sc.next();
            if(tmp.isEmpty()) break;
            res += tmp + " ";
        }
        String d[] = res.split("[.?!]+");
        for (int i = 0; i < d.length; i++) {
            d[i] = d[i].trim();
            if(!d[i].isEmpty()) d[i] = d[i].substring(0, 1).toUpperCase() + d[i].substring(1).toLowerCase();
        }
        for (String i : d) {
            if(!i.isEmpty()) System.out.println(i.trim());
        }
    }
}

//AAA BAABA HDHDH ACBSD SRGTDH DDDDS
//DUAHD AAA AD DA HDHDH AAA AAA AAA AAA
//DDDAS HDHDH HDH AAA AAA AAA AAA AAA
//AAA AAA AAA
//DHKFKH DHDHDD HDHDHD DDDHHH HHHDDD
//TDTD MMMMM AAAAA