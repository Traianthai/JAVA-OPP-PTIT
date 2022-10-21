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
        ArrayList <KhachHang> Ar = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            KhachHang a = new KhachHang("KH" + String.format("%02d", i+1), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            Ar.add(a);
        }
        Collections.sort(Ar);
        for (KhachHang i : Ar) {
            System.out.println(i);
        }
    }
}


//3
//KD
//400
//555
//NN
//58
//400
//CN
//150
//700