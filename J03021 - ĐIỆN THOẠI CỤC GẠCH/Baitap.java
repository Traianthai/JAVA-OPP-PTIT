package a;








import java.util.Scanner;


public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    
    
    public void process(){
        int a[] = { 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9 };
            String s = sc.next().toLowerCase();
            String x = "", z = "";
            for (int i = 0; i < s.length(); i++) {
                String k = Integer.toString(a[s.charAt(i) - 'a']);
                x = x + k;
                z = k + z;
            }
            if (x.compareTo(z) == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        
        
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
//BOHIMA
//IamAdoder