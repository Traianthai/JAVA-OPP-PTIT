package a;

public class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String ma, name;
    private int sl;

    public DoanhNghiep() {
    }

    public DoanhNghiep(String ma, String name, int sl) {
        this.ma = ma;
        this.name = name;
        this.sl = sl;
    }

    public int getSl() {
        return sl;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        if(o.sl == this.sl) return this.ma.compareTo(o.ma);
        else if(o.sl > this.sl) return 1;
        return -1;
    }
    public String toString(){
        return ma + " " + name + " " + sl ;
        
    }
}



