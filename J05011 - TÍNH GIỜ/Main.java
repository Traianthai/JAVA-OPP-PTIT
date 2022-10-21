package a;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList <Gamer> Ar = new ArrayList<>();
        int t= Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            Gamer a = new Gamer(sc.nextLine(), sc.nextLine(), new SimpleDateFormat("hh:mm").parse(sc.nextLine()), 
                    new SimpleDateFormat("hh:mm").parse(sc.nextLine()));
            Ar.add(a);
        }
        Collections.sort(Ar);
        for (Gamer i : Ar) {
            System.out.println(i);
        }
        
    }
}