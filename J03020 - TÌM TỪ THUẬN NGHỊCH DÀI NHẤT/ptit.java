package a;

import java.math.BigInteger;
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
        LinkedHashMap<String,Integer> mp = new LinkedHashMap<>();
        int len = 0;
        while(sc.hasNextLine()){
            String tmp = sc.nextLine();
            if(tmp.isEmpty()) break;
            String d[] = tmp.split("\\s+");
            for (String i : d) {
                if( PTIT.check(i)) {
                    if(mp.containsKey(i)){
                        int dem = mp.get(i);
                        mp.put(i, dem+1);
                        len = Math.max(len, i.length());
                    }else{
                        mp.put(i, 1);
                        len = Math.max(len, i.length());
                    }
                }
            }
            
        }
        for (Map.Entry<String,Integer> entry: mp.entrySet()){
            if( entry.getKey().length() == len) 
                System.out.println(entry.getKey() + " " + entry.getValue());
        }
//        System.out.println(len + " " + maxx);
    }
}

//AAA BAABA HDHDH ACBSD SRGTDH DDDDS
//DUAHD AAA AD DA HDHDH AAA AAA AAA AAA
//DDDAS HDHDH HDH AAA AAA AAA AAA AAA
//AAA AAA AAA
//DHKFKH DHDHDD HDHDHD DDDHHH HHHDDD
//TDTD MMMMM AAAAA