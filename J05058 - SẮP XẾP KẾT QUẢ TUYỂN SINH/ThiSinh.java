package a;


public class ThiSinh implements Comparable<ThiSinh> {

    private String id, name;
    private float d1, d2, d3;

    public ThiSinh() {
    }

    public ThiSinh(String id, String name, float d1, float d2, float d3) {
        this.id = id;
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    private String Ut(){
        if(id.contains("KV1")) return "" +0.5;
        else if(id.contains("KV2")) return "" +1;
        else return "" + 2.5;
    }
   
    private Float Tongdiem(){
        return d1*2 + d2 + d3 + Float.parseFloat(Ut());
    }
    private String TD(){
        if(Tongdiem() % 1 == 0) return String.format("%.0f", Tongdiem());
        else return String.format("%.1f", Tongdiem());
        
    }
    private String TT(){
        if(Tongdiem() < 24) return "TRUOT";
        else return "TRUNG TUYEN";
        
    }
    
    @Override
    public String toString(){
        return id + " " + name  + " " + Ut() + " " + TD() + " " + TT(); 
    }
    public  float tong(){
        return d1*2+ d2+ d3;
    }
    @Override
    public int compareTo(ThiSinh o) {
        if(this.Tongdiem() < o.Tongdiem()) return 1;
        if(this.Tongdiem() > o.Tongdiem()) return -1;
        
        return this.id.compareTo(o.id);
    }
}