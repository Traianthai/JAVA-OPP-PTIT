package a;


public class ThiSinh implements Comparable<ThiSinh> {

    private String id, name,lop;
    private float d1, d2, d3;

    public ThiSinh() {
    }

    public ThiSinh(String id, String name,String lop, float d1, float d2, float d3) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    
   
    
    
    @Override
    public String toString(){
        return id + " " + name + " " + lop + " " + String.format("%.1f %.1f %.1f", d1,d2,d3); 
    }
    public  float tong(){
        return d1+ d2+ d3;
    }
    @Override
    public int compareTo(ThiSinh o) {
        return this.id.compareTo(o.id);
    }
}