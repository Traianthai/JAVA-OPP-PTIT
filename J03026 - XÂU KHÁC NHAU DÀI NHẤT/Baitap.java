package a;








import java.util.Scanner;


public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    public int check(String a){
        int dem = 0;
        for (int i = 0; i < a.length()/2; i++) {
            if(a.charAt(i) != a.charAt(a.length() - 1 -i)) dem++;
        }
        if(dem == 0 && a.length() % 2 != 0) return 1;
        if(dem == 1) return 1;
        else return 0;
    }
    
    public void process(){
        String a = sc.nextLine();
        String b = sc.nextLine();
        if(a.equals(b)) System.out.println("-1");
        else System.out.println(Math.max(a.length(), b.length()));
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
//2
//abcd
//defgh
//a
//a