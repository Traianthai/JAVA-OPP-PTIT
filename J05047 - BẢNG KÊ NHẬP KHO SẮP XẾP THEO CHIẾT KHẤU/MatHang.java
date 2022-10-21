package a;
import java.util.StringTokenizer;


public class MatHang implements Comparable<MatHang>{
    private String id , name;
    private long soluong,dongia;
    

    public MatHang() {
    }

    public MatHang(String id, String name, int soluong, int dongia) {
        String d[] = name.split("\\s+");
        String res = "";
        res += d[0].substring(0,1).toUpperCase();
        res += d[1].substring(0,1).toUpperCase();
        this.id = res +id;
        this.name = name;
        this.soluong = soluong;
        this.dongia = dongia;
    }
    private long getChieuKhau(){
        float res = soluong*dongia;
        if(soluong > 10) return  (long) (res*0.05);
        else if(soluong >= 8) return  (long) (res * 0.02);
        else if(soluong >= 5) return  (long) (res * 0.01);
        else return 0;
    } 
    
    public String toString(){
        return id + " " + name + " " + getChieuKhau()+ " " + String.valueOf(soluong*dongia - getChieuKhau());
        
    }

    @Override
    public int compareTo(MatHang o) {
        if(this.getChieuKhau() < o.getChieuKhau()) return 1;
        return -1;
    }
   
}