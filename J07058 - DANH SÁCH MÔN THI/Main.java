package a;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList <MonHoc> mh = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            MonHoc m = new MonHoc(sc.nextLine().trim(),sc.nextLine().trim(),sc.nextLine().trim());
            mh.add(m);
        }
        Collections.sort(mh);
        for (MonHoc i : mh) {
            System.out.println(i);
        }
    }
}





