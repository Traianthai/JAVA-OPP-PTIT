package a;


/**
 *
 * @author manhz
 */
public class DonHang implements Comparable<DonHang>{
    private String name,id;
    private long dongia,soluong;

    public DonHang(String name, String id, long dongia, long soluong) {
        this.name = name;
        this.id = id;
        this.dongia = dongia;
        this.soluong = soluong;
    }
    private  String getSTT(){
        return id.substring(1, 4);
    }
    private  long getGiamgia(){
        if(id.charAt(4) == '1') return dongia*soluong*50/100;
        return (dongia*soluong*30)/100;
    }
    private long getThanhtien(){
        return dongia*soluong - getGiamgia();
        
    }
    @Override
    public String toString(){
        return name + " " + id + " "+ getSTT()+ " " + getGiamgia() + " " + getThanhtien();
    }

    @Override
    public int compareTo(DonHang o) {
        return this.getSTT().compareTo(o.getSTT());
    }
    
}



