package a;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> ar = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            SinhVien a = new SinhVien(i+1, sc.nextLine(), sc.nextLine(),new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine()),
                Float.parseFloat(sc.nextLine()));
            ar.add(a);
        }
        for (SinhVien i : ar) {
            System.out.println(i);
        }
    }
}
//1
//Nguyen Van An
//D20CQCN01-B
//2/12/2002
//3.19




