package a;
public class ThiSinh {

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
    
    public float ut() {
        String res = id.substring(0, 3);
        if (res.equals("KV1")) {
            return  0.5f;
        } else if (res.equals("KV2")) {
            return  1;
        } else {
            return 2.5f;
        }
    }
    public static String trans(float a){
        if(a % 1 == 0){
            return String.format("%.0f", a);
        }else{
            return String.format("%.1f", a);
        }
    }
    
    public String check(){
        if(d1*2 + d2 + d3 + ut() >= 24) return "TRUNG TUYEN";
        else return "TRUOT";
        
    }
    @Override
    public String toString(){
        return id + " " + name + " " + trans(ut()) + " " + trans(d1*2+d2+d3) + " " + check();
        
    }
}