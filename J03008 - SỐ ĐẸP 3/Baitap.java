package a;





import java.util.Scanner;



public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    public boolean check(String a){
        int sum = 0 ;
//        System.out.println(a.length());
        for (int i = 0; i < a.length()/2; i++) {
            if(a.charAt(i) != a.charAt(a.length()-1-i)) return false;
            if(a.charAt(i) == '1' || a.charAt(i) == '4' || a.charAt(i) == '6' || a.charAt(i) == '8' || a.charAt(i) == '9') return false;
//            sum = sum + Integer.parseInt(a.substring( i, i+1)) * 2 ;
        }
       
//        if(a.length()% 2 != 0) {
//            sum = sum + Integer.parseInt(a.substring( a.length()/2+1,a.length()/2+2));
//        }
//      
//        if(sum % 10 != 0) return false;
//        if(a.charAt(0) != '8' || a.charAt(a.length()-1) != '8') return false;
       
        
        return true;
        
    }
    
    public void process(){
        int n = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < n; i++) {
            String a = sc.nextLine().trim();
            if(check(a)) System.out.println("YES");
            else System.out.println("NO");
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
//123456787654321
//235755557532
//2222333355557777235775327777555533332222