package a;





import java.util.Scanner;



public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    public boolean check(String a){
        for (int i = 0; i < a.length()/2; i++) {
            if(a.charAt(i) != a.charAt(a.length()-1-i)) return false;
            if(Integer.parseInt(a.substring(i,i+1))% 2 == 1) return false; 
        }
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

//4
//123456787654321
//86442824468
//8006000444422220000222244440006008
//235365789787654324567856578654356786556