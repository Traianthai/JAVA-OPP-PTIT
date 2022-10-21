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
//abccaa
//abbcca
//abcda