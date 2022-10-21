package a;






import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    
    
    public void process(){
        int z = Integer.parseInt(sc.nextLine());
        ArrayList <String> a = new ArrayList<>();
        while(z-- != 0){
            StringTokenizer s1 = new StringTokenizer(sc.nextLine().trim().toLowerCase());
            String res = "";
            String last = "";
            while(s1.hasMoreTokens()){
                last = s1.nextToken();   
                res += last.charAt(0);
            }
            res = res.substring(0, res.length()-1);
            res = last + res ;
            a.add(res);
            int dem = Collections.frequency(a, res);
            System.out.println(res + (dem == 1 ? "" : dem) + "@ptit.edu.vn");
        }
        
        
        
        
    }
    
    public static void main(String[] args) {
//        int z = Integer.parseInt(sc.nextLine());
//        int t = 1;
//        while(t <= z){
            Baitap a = new Baitap();
            a.process();
//            t++;
//        }
    }
    
}

//4
//    nGUYEn    quaNG   vInH  
//   tRan   thi THU    huOnG
//   nGO   quoC  VINH
// lE            tuAn    aNH