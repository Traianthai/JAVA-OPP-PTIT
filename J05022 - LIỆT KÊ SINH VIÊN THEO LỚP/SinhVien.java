package a;


public class SinhVien {
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

    public String getLop() {
        return lop;
    }
    
    
    
    public SinhVien() {
    }
    
}