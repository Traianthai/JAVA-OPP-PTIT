package a;



public class HocSinh implements Comparable<HocSinh>{
    private String id,name;
    private float  diem;
    private String xeploai;

    public HocSinh(String id, String name, String ds) {
        this.id = id;
        this.name = name;
        String d[] = ds.split("\\s+");
        float sum = Float.parseFloat(d[0]) + Float.parseFloat(d[1]);
        for (String i : d) {
            sum += Float.parseFloat(i);
        }
        int temp = Math.round(sum / 12 * 10);
        this.diem = (float) temp / 10;
        
        if(diem >= 9) xeploai = "XUAT SAC";
        else if(diem >= 8) xeploai = "GIOI";
        else if(diem >=7) xeploai = "KHA";
        else if(diem >=5) xeploai = "TB";
        else xeploai = "YEU";
        
    }

    public HocSinh() {
    }

    @Override
    public int compareTo(HocSinh o) {
        if(o.diem == this.diem) return this.id.compareTo(o.id);
        if(o.diem > this.diem) return 1;
        return -1;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + diem + " " + xeploai;
        
    }
}




