package so0va9;



import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int z = sc.nextInt();
            Queue<String> qe = new LinkedList<>();
            qe.add("9");
            long kq = 0;
            while(true){
                String res = qe.element();
                qe.remove();
                long s = Long.parseLong(res);
                if(s%z == 0){
                    kq = s;
                    break;
                }
                qe.add(res+ "0");
                qe.add(res+ "9");
            }
            System.out.println(kq);
        }
    }
}
