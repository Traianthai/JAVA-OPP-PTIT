package a;

import java.util.*;
import java.text.*;
/**
 *
 * @author manhz
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<VanDongVien> Ar = new ArrayList<>();
        ArrayList<VanDongVien> Br = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            VanDongVien a = new VanDongVien("VDV" + String.format("%02d", i+1), sc.nextLine(), new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine()),
                    new SimpleDateFormat("hh:mm:ss").parse(sc.nextLine()), new SimpleDateFormat("hh:mm:ss").parse(sc.nextLine()));
            Ar.add(a);
        }
        Br.addAll(Ar);
        Collections.sort(Br);
        long m = Br.get(0).Time();
        int o = 1;
        for(int i = 0 ; i < Br.size() ; i ++){
            if(Br.get(i).Time() ==  m){
                Br.get(i).setXephang(o);
            }else{
                o = i +1;
                m = Br.get(i).Time();
                Br.get(i).setXephang(o);
            }
        }
        for (VanDongVien i : Ar) {
            for (VanDongVien j : Br) {
                if(j.Time() == i.Time()) i.setXephang(j.getTT());
            }
        }
        for (VanDongVien i : Ar) {
            System.out.println(i);
        }
    }
}

//3
//Nguyen Van Thanh
//20/03/1990
//07:00:00
//07:10:01
//Nguyen Hoa Binh
//01/10/1993
//07:02:00
//07:11:20
//Le Thanh Van
//15/03/1998
//07:05:00
//07:15:30






//new SimpleDateFormat("hh:mm:ss").parse("00:00:0" + res);

