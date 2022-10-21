package a;
import java.util.*;

/**
 *
 * @author manhz
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList <DonHang> Ar = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            DonHang a = new DonHang(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            Ar.add(a);
        }
        for (DonHang i : Ar) {
            System.out.println(i);
        }
    }
}
//3
//Kaki 2
//K0252
//80000
//15
//Jean 1
//J2011
//200000
//24
//Jean 2
//J0982
//150000
//12