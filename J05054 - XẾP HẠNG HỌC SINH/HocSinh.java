package a;


public class HocSinh implements Comparable<HocSinh>{
    private String id,name;
    private float  diem;
    private String xeploai;
    private int thuhang;

    public HocSinh(String id, String name, float diem) {
        this.id = id;
        this.name = name;
        
        if(diem >= 9) xeploai = "Gioi";
        else if(diem >=7) xeploai = "Kha";
        else if(diem >=5) xeploai = "Trung Binh";
        else xeploai = "Yeu";
        this.diem = diem;
        
    }

    public int getThuhang() {
        return thuhang;
    }
    
    public void setThuhang(int thuhang) {
        this.thuhang = thuhang;
    }

    public float getDiem() {
        return diem;
    }
    
    public HocSinh() {
    }

    @Override
    public int compareTo(HocSinh o) {
        if(o.diem > this.diem) return 1;
        return -1;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + diem + " " + xeploai + " " + thuhang;
        
    }
}



