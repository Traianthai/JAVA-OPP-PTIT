package a;
public class MonHoc implements Comparable<MonHoc>{
    private String ma,ten,thi;

    public MonHoc() {
    }

    public MonHoc(String ma, String ten, String thi) {
        this.ma = ma;
        this.ten = ten;
        this.thi = thi;
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + thi;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.ma.compareTo(o.ma);
    }
}