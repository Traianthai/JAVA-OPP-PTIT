package z;



public class NhanVien implements Comparable<NhanVien>{
    private String id,name;
    private long luongngay,songay;
    private String cv;

    public NhanVien() {
    }

    public NhanVien(String id,String name, String cv,long luongngay, long songay) {
        this.id = id;
        this.name = name;
        this.cv = cv;
        this.luongngay = luongngay;
        this.songay = songay;
        
    }

    public String getCv() {
        return cv;
    }
    
    private long getLuongthang(){
        return luongngay*songay;
    }
    private   long getTamUng(){
        long a = (getThucLinh()* 2) / 3;
        if (a < 25000) {
            return Math.round((double) a / 1000) * 1000;
        } else {
            return 25000;
        }
    }
    private int getPhuCap(){
        if(cv.equals("GD")) return 500;
        else if(cv.equals("PGD")) return 400;
        else if(cv.equals("TP")) return 300;
        else if(cv.equals("KT")) return 250;
        return 100;
    }
    private  long getThucLinh(){
        return getLuongthang() + getPhuCap();
    }
    @Override
    public String toString(){
        return id + " " + name + " " + getPhuCap()+ " " +  getLuongthang()+ " "  + getTamUng() + " " + String.valueOf(getThucLinh()-getTamUng());
        
    }

    @Override
    public int compareTo(NhanVien o) {
        if(this.getThucLinh() < o.getThucLinh()) return 1;
        if(this.getThucLinh() > o.getThucLinh()) return -1;
        return 0;
    }
    
    
    
}