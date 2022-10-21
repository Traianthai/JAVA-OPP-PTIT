package a;


import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;


class Mathang{
    String ma,ten,donvi;
    int giaban,giamua;

    public Mathang() {
    }

    public Mathang(String ma, String ten, String donvi, int giaban, int giamua) {
        this.ma = ma;
        this.ten = ten;
        this.donvi = donvi;
        this.giaban = giaban;
        this.giamua = giamua;
    }
    
    public void Input(Scanner sc,int ma){
        DecimalFormat de = new DecimalFormat("#000");
        this.ma = "MH" + de.format(ma);
        ten = sc.nextLine();
        donvi = sc.nextLine();
        giamua = Integer.parseInt(sc.nextLine());
        giaban = Integer.parseInt(sc.nextLine());
    }
    
    public void Output(){
        System.out.printf("%s %s %s %d %d %d\n",ma,ten,donvi,giamua,giaban,giaban-giamua);
         
    }
    
}
public class Baitap{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        Vector <Mathang> ve = new Vector<>();
        for (int i = 0; i < n; i++) {
            Mathang a = new Mathang();
            a.Input(sc, i+1);
            ve.add(a);
        }
        Collections.sort(ve, new Comparator<Mathang>(){
            public int compare(Mathang a,Mathang b){
                int gia1 = a.giamua - a.giaban;
                int gia2 = b.giamua - b.giaban;
                if(gia1 > gia2 ) return 1;
                else if(gia1 == gia2){
                    if(a.ma.compareTo(b.ma)> 0) return 1;
                    else return -1;
                    
                }else return -1;
                 
            }
            
            
        });
        for (Mathang mathang : ve) {
            mathang.Output();
        }
    }
    
}

//10
//Ao phong tre em
//Cai
//25000
//41000
//Ao khoac nam
//Cai
//240000
//515000
//Ao phong tre em
//Cai
//25000
//41000
//Ao phong tre em
//Cai
//25000
//41000
//Ao phong tre em
//Cai
//25000
//41000
//Ao phong tre em
//Cai
//25000
//41000
//Ao phong tre em
//Cai
//25000
//41000
//Ao phong tre em
//Cai
//25000
//41000
//Ao phong tre em
//Cai
//25000
//41000
//Ao phong tre em
//Cai
//25000
//41000