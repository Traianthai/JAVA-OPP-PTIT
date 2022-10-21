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

    public String getNganh() {
        if(ma.contains("DCKT")) return "KE TOAN";
        else if(ma.contains("DCCN")) return "CONG NGHE THONG TIN";
        else if(ma.contains("DCAT")) return "AN TOAN THONG TIN";
        else if(ma.contains("DCVT")) return "VIEN THONG";
        return "DIEN TU";
    }

    public String getLop() {
        return lop;
    }
    
    
    
    public SinhVien() {
    }
    
}