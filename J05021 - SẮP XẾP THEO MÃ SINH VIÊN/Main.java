package a;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        ArrayList <SinhVien> sv = new ArrayList<>();
        while(sc.hasNextLine()){
            String res = sc.nextLine();
            if(res.isEmpty()) break;
            SinhVien a = new SinhVien( res, sc.nextLine(),sc.nextLine(),sc.nextLine());
            sv.add(a);
        }
        Collections.sort(sv);
        for (SinhVien i : sv) {
            System.out.println(i);
        }
    }
    
}
//4
//B16DCCN011
//Nguyen Trong Duc Anh
//D16CNPM1
//sv1@stu.ptit.edu.vn
//B15DCCN215
//To Ngoc Hieu
//D15CNPM3
//sv2@stu.ptit.edu.vn
//B15DCKT150
//Nguyen Ngoc Son
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//Nguyen Trong Tung
//D15CQKT03-B
//sv4@stu.ptit.edu.vn




