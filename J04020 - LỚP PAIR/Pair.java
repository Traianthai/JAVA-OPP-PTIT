package a;



public class Pair<T0, T1> {
    private T0 a;
    private T1 b;

    public Pair() {
    }

    public Pair(T0 a, T1 b) {
        this.a = a;
        this.b = b;
    }

    boolean isPrime() {
        if(check1() && check2()){
            return true;
        }
        return false;
        
    }

    private boolean check1() {
        if((Integer)a < 2) return false;
        for (int i = 2; i <= Math.sqrt((Integer)a); i++) {
            if((Integer)a % i == 0) return false;
        }
        return true;
    }

    private boolean check2() {
        if((Integer)b < 2) return false;
        for (int i = 2; i <= Math.sqrt((Integer)b); i++) {
            if((Integer)b % i == 0) return false;
        }
        return true;
    }
    public String toString(){
        return a + " " + b;
    }
}