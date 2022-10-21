package a;



public class NhanVien {
    private String id,name;
    private int luongngay,songay;
    private String cv;

    public NhanVien() {
    }

    public NhanVien(String id,String name, int luongngay, int songay, String cv) {
        this.id = id;
        this.name = name;
        this.luongngay = luongngay;
        this.songay = songay;
        this.cv = cv;
    }
    private int getLuongthang(){
        return luongngay*songay;
    }
    private int getThuong(){
        if(songay >= 25) return (int)(0.2*getLuongthang());
        else if(songay >= 22) return (int)(0.1*getLuongthang());
        return 0;
    }
    private int getPhuCap(){
        if(cv.equals("GD")) return 250000;
        else if(cv.equals("PGD")) return 200000;
        else if(cv.equals("TP")) return 180000;
        return 150000;
    }
    public int getThucLinh(){
        return getLuongthang()+getPhuCap()+getThuong();
    }
    @Override
    public String toString(){
        return id + " " + name + " " + getLuongthang()+ " " + getThuong()+ " " + getPhuCap() + " " + getThucLinh();
        
    }
    
    
    
}