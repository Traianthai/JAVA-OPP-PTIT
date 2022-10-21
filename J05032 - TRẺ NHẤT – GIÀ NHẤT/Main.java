package a;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList <People> Ar = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            People a = new People(sc.next(), new SimpleDateFormat("dd/MM/yyyy").parse(sc.next()));
            sc.nextLine();
            Ar.add(a);
        }
        Collections.sort(Ar);
        System.out.println(Ar.get(0).getName());
        System.out.println(Ar.get(Ar.size()-1).getName());
    }
}
//5
//Nam 01/10/1991
//An 30/12/1990
//Binh 15/08/1993
//Tam 18/09/1990
//Truong 20/09/1990



