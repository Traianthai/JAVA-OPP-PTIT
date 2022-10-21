package a;


public class SinhVien implements Comparable<SinhVien>{
    private String ma,name,lop,gmail;
    


    public SinhVien(String ma, String name, String lop, String gmail) {
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.gmail = gmail;
    }
    @Override
    public String toString(){
        return ma + " " + name + " " + lop + " " + gmail;
        
    }

    
    @Override
    public int compareTo(SinhVien a){
        return this.ma.compareTo(a.ma);
    }
    public SinhVien() {
    }
    
}