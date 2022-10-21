package a;
public class PhanSo {
    private long tu,mau;

    public PhanSo(long tu, long mau) {
        long a = UCLN(tu,mau);
        this.tu = tu/a;
        this.mau = mau/a;
        
    }
    public long UCLN(long a,long b){
        while(b != 0){
            long tmp = a % b;
            a = b ;
            b = tmp;
        }
        return a;
    }
    public PhanSo add(PhanSo a){
        long x = a.tu*this.mau + a.mau*this.tu;
        long y = a.mau*this.mau;
        PhanSo c = new PhanSo(x,y);
        return c;
    }
    
    public PhanSo mutil(PhanSo a){
        long x = a.tu*this.tu;
        long y = a.mau*this.mau;
        PhanSo c = new PhanSo(x,y);
        return c;
    }
    
    public String toString(){
        return tu + "/" + mau;
    }
}