package a;
import java.util.StringTokenizer;


public class SinhVien implements Comparable<SinhVien>{
    private String name;
    private int ac,sub;

    public SinhVien() {
    }

    public SinhVien(String name, String in) {
        StringTokenizer s = new StringTokenizer(name);
        String res = "";
        String tmp = "";
        while(s.hasMoreElements()){
            tmp = s.nextToken();
            res += tmp.substring(0,1).toUpperCase()+tmp.substring(1).toLowerCase() + " ";
        }
        this.name = res.trim();
        String d[] = in.split("\\s+");
        this.ac = Integer.parseInt(d[0]);
        this.sub = Integer.parseInt(d[1]);
        
    }
    @Override
    public String toString(){
        return name + " " + ac +  " " + sub;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.ac < o.ac) return 1;
        if(this.ac > o.ac) return -1;
        if(this.sub > o.sub) return 1;
        if(this.sub < o.sub) return -1;
        return this.name.compareTo(o.name);
    }
    
}