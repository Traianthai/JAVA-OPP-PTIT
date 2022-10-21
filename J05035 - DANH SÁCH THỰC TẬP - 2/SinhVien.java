package a;


public class SinhVien implements Comparable<SinhVien>{
    private int stt;
    private String ma,name,lop,gmail,doanhnghiep;

    public SinhVien(int stt, String ma, String name, String lop, String gmail, String doanhnghiep) {
        this.stt = stt;
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.gmail = gmail;
        this.doanhnghiep = doanhnghiep;
    }
    


   
    @Override
    public String toString(){
        return stt + " " + ma + " " + name + " " + lop + " " + gmail + " " + doanhnghiep;
        
    }

    public String getDoanhnghiep() {
        return doanhnghiep;
    }
    
   

    
    
    public SinhVien() {
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.ma.compareTo(o.ma);
    }
    
}