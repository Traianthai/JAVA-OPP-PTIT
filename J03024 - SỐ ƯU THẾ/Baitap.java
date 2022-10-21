package a;








import java.util.Scanner;


public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    public int check(String a){
        if(!a.matches("\\d+")) return -1;
        if(a.length() % 2 == 0){
            int dem1 = 0;
            int dem2 = 0;
            for (int i = 0; i < a.length(); i++) {
                if((a.charAt(i) -'0') % 2 == 0) dem1 ++;
                else dem2 ++;
            }
            if(dem1 > dem2) return 1;
            else return 0;
        }
        if(a.length() % 2 != 0){
            int dem1 = 0;
            int dem2 = 0;
            for (int i = 0; i < a.length(); i++) {
                if((a.charAt(i) -'0') % 2 == 0) dem1 ++;
                else dem2 ++;
            }
            if(dem1 < dem2) return 1;
            else return 0;
        }
        return 0;
    }
    
    public void process(){
        String a = sc.nextLine();
        if(check(a) == -1) System.out.println("INVALID");
        else if(check(a) == 0) System.out.println("NO");
        else System.out.println("YES");
    }
    
    public static void main(String[] args) {
        int z = Integer.parseInt(sc.nextLine());
        int t = 1;
        while(t <= z){
            Baitap a = new Baitap();
            a.process();
            t++;
        }
    }
    
}
//3
//01234aa32432432432534545b987978
//1234567890123456789000
//999999999999999999999999999999