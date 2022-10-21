package a;
import java.text.*;
import java.util.*;

/**
 *
 * @author manhz
 */
public class VanDongVien implements Comparable<VanDongVien>{
    private String id,name;
    private Date ngaysinh,xp,vd;
    private int xephang;
    
    public VanDongVien(String id, String name, Date ngaysinh, Date xp, Date vd) {
        this.id = id;
        this.name = name;
        this.ngaysinh = ngaysinh;
        this.xp = xp;
        this.vd = vd;
    }
    private int getTuoi(){
        return 2021 - Integer.parseInt(new SimpleDateFormat("yyyy").format(ngaysinh)) ;
    }

    private  int getUt(){
        int res = 0;
        if(getTuoi() < 18) res = 0;
        else if(getTuoi() < 25) res = 1;
        else if(getTuoi() <= 32) res = 2;
        else res = 3;
        return res;
    }
    private  String getThanhtich() {
        long time = (vd.getTime()-xp.getTime())/1000;
        return String.format("%02d:%02d:%02d", time/3600,(time%3600)/60,time%60);
        
    }

    public void setXephang(int xephang) {
        this.xephang = xephang;
    }
    
    private  String getXephang() {
        long time = (vd.getTime()-xp.getTime())/1000 - getUt();
        return String.format("%02d:%02d:%02d", time/3600,(time%3600)/60,time%60);
        
    }
    public   long Time(){
        return (vd.getTime()-xp.getTime())/1000 - getUt();
    }
    @Override
    public String toString(){
        return id + " " + name + " " + getThanhtich() + " " + "00:00:0" + getUt() + " " + getXephang() +" "+ xephang;
    }

    @Override
    public int compareTo(VanDongVien o) {
        if(this.Time() > o.Time()) return 1;
        if(this.Time() < o.Time()) return -1;
        return 0;
    }
    public int getTT(){
        return xephang;
    }
}