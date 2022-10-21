package a;


public class ThiSinh implements Comparable<ThiSinh> {

    private String id, name,date;
    private float d1, d2, d3;

    public ThiSinh() {
    }

    public ThiSinh(String id, String name,String date, float d1, float d2, float d3) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    
   
    
    
    @Override
    public String toString(){
        return id + " " + name + " " + date + " " + String.valueOf(tong()); 
    }
    public  float tong(){
        return d1+ d2+ d3;
    }
    @Override
    public int compareTo(ThiSinh o) {
        if(this.tong() == o.tong()) return this.id.compareTo(o.id);
        if(this.tong() < o.tong()) return 1;
        return -1;
    }
}
