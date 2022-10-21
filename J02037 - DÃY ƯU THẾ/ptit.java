package a;

import java.util.*;





public class ptit{
    
    
    boolean check(String a){
        String d[] = a.split("\\s+");
        if(d.length % 2 == 0){
            int dem1 = 0;
            int dem2 = 0;
            for (String i : d) {
                if(Integer.parseInt(i)%2 == 0) dem1 ++;
                else dem2++;
            }
            if(dem1 > dem2) return true;
            else return false;
        }else{
            int dem1 = 0;
            int dem2 = 0;
            for (String i : d) {
                if(Integer.parseInt(i)%2 == 0) dem1 ++;
                else dem2++;
            }
            if(dem1 < dem2) return true;
            else return false;
        }
        
    }
    
    
    
    
    public static void main(String[] args)  {
        ptit a = new ptit();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while( n-- != 0){
            if(a.check(sc.nextLine())) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

//2
//11 22 33 44 55 66 77
//23 34 45 56 67 78 89 90 121 131 141 151 161 171