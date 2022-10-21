package a;



import java.util.*;

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
            qe.add("6");
            qe.add("8");
            ArrayList<String> Ar = new ArrayList<>();
            while(true){
                String res = qe.element();
                qe.remove();
                if(res.length() > z){
                    break;
                }
                Ar.add(res);
                qe.add(res+ "6");
                qe.add(res+ "8");
            }
            System.out.println(Ar.size());
            for (int j = Ar.size()-1; j >= 0; j--) {
                System.out.print(Ar.get(j) + " ");
                
            }
            System.out.println("");
        }
    }
}
