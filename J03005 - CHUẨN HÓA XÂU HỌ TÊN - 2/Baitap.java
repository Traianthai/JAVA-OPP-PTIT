package a;





import java.util.Scanner;



public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    
    public void process(){
        int n = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < n; i++) {
            String a = sc.nextLine().trim();
            String[] d = a.toLowerCase().split("\\s+");
            String res = "";
            for (int j = 1; j < d.length-1; j++) {
                res +=  d[j].substring(0, 1).toUpperCase() + d[j].substring(1);
                res += " ";
            }
            res += d[d.length-1].substring(0, 1).toUpperCase() + d[d.length-1].substring(1) + ", " + d[0].toUpperCase();
            System.out.println(res);
        }
    }
    
    public static void main(String[] args) {
//        int z =sc.nextInt();
//        int t = 1;
//        while(t <= z){
            Baitap a = new Baitap();
            a.process();
//            t++;
//        }
    }
    
}

//7
//   nGuYEN    vAN    naM
//tRan           TRUNG hiEU
//      vO le         hOA bINh
//    nGUYEn    quaNG   vInH  
//   tRan   thi THU    huOnG
//   nGO   quoC  VINH
// lE            tuAn    aNH