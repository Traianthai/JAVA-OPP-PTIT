package a;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            SinhVien a = new SinhVien(i+1, sc.nextLine().trim(), sc.next(),new SimpleDateFormat("dd/MM/yyyy").parse(sc.next()),
            sc.nextFloat());
            System.out.println(a);
        }
        
    }
}
//5
//nGuyEn  vaN    biNH
//D20CQCN01-B
//2/12/2002
//3.1
//nGuyEn  vaN    biNH
//D20CQCN01-B
//2/12/2002
//3.1
//nGuyEn  vaN    biNH
//D20CQCN01-B
//2/12/2002
//3.1
//nGuyEn  vaN    biNH
//D20CQCN01-B
//2/12/2002
//3.1
//nGuyEn  vaN    biNH
//D20CQCN01-B
//2/12/2002
//3.1




