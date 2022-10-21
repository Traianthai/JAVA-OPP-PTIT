package a;


import java.util.Scanner;

class SoPhuc {

    private int thuc,ao;

    public SoPhuc(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    public SoPhuc() {
    }
    
    public SoPhuc add(SoPhuc c) {
        SoPhuc temp = new SoPhuc();
        temp.thuc = c.thuc + this.thuc;
        temp.ao = c.ao + this.ao;
        return temp;
    }

    public SoPhuc multiply(SoPhuc c) {
        //(a + bi)*(c + di) = (ac - bd) + (ad + bc)i
        SoPhuc temp = new SoPhuc();
        temp.thuc = c.thuc * this.thuc - c.ao * this.ao;
        temp.ao = c.thuc * this.ao + c.ao * this.thuc;
        return temp;
    }

    @Override
    public String toString() {
        return this.thuc + " + " + this.ao + "i";
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            SoPhuc a = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc b = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc e = a.add(b);
            SoPhuc c = a.multiply(e);
            SoPhuc d = e.multiply(e);
            System.out.println(c + ", " + d);
        }
    }
}
