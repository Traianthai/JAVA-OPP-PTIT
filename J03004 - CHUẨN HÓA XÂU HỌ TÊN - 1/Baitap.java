package a;





import java.util.Scanner;



public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    
    public void process(){
        int n = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < n; i++) {
            String a = sc.nextLine().trim();
            String[] d = a.toLowerCase().split("\\s+");
            for (String string : d) {
                String res =  string.substring(0, 1).toUpperCase() + string.substring(1);
                System.out.print(res + " ");
            }
            System.out.println("");
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

//3
//   nGuYEN    vAN    naM
//tRan           TRUNG hiEU
//      vO le         hOA bINh