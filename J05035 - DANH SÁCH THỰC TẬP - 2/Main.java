package a;
    
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import sinhvien.SinhVien;

public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        ArrayList <SinhVien> sv = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            SinhVien a = new SinhVien( i+1,sc.nextLine().trim(),sc.nextLine().trim(), sc.nextLine().trim(),sc.nextLine().trim(),
                    sc.nextLine());
            sv.add(a);
        }
        Collections.sort(sv);
        int z = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < z; i++) {
            String res = sc.nextLine();
            for (SinhVien j : sv) {
                if(j.getDoanhnghiep().equals(res)) System.out.println(j.toString());
            }
        }
        
        
    }
    
}
//6
//B17DCCN016 
//Le Khac Tuan Anh 
//D17HTTT2   
//test1@stu.ptit.edu.vn
//VIETTEL
//B17DCCN107 
//Dao Thanh Dat    
//D17CNPM5   
//test2@stu.ptit.edu.vn
//FPT
//B17DCAT092 
//Cao Danh Huy     
//D17CQAT04-B
//test3@stu.ptit.edu.vn
//FPT
//B17DCCN388 
//Cao Sy Hai Long  
//D17CNPM2   
//test4@stu.ptit.edu.vn
//VNPT
//B17DCCN461 
//Dinh Quang Nghia 
//D17CNPM2   
//test5@stu.ptit.edu.vn
//FPT
//B17DCCN554 
//Bui Xuan Thai    
//D17CNPM1   
//test6@stu.ptit.edu.vn
//GAMELOFT
//2
//FPT
//VIETTEL






