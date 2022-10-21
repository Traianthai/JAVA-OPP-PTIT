package a;

import java.util.Scanner;






public class Baitap{
    private static Scanner sc = new Scanner(System.in);
    public String check(String line){
        String res = "";
        for(int i = 0 ; i < line.length(); i ++){
            if(line.charAt(i) == '1') res += line.charAt(i);
            else if(line.charAt(i) == '9' || line.charAt(i) == '0' || line.charAt(i) == '8') res += '0';
            else return "INVALID";
        }
        String tmp = res.replaceFirst("^0+", "");
        return "".equals(tmp) ? "INVALID" : tmp;
        
    }
    public void process(){
        int z = sc.nextInt();
        while(z-- != 0){
            String num = sc.next();
            System.out.println(check(num));
        }
        
        
    }
    public static void main(String[] args) {
        Baitap a = new Baitap();
        a.process();
    }
    
}
//3
//1890
//3681
//8919