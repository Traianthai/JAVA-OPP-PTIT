package a;


import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien implements Comparable<SinhVien>{
    private String name,lop;
    private float gpa;
    private Date date;
    private int ma;

    public SinhVien(int ma, String name, String lop, Date date, float gpa) {
        this.ma = ma;
        this.name = name;
        this.date = date;
        this.lop = lop;
        this.gpa = gpa;
    }
    @Override
    public String toString(){
        return "B20DCCN" + new DecimalFormat("#000").format(ma) + " " + chuanhoa() + " " + lop + " " 
        + new SimpleDateFormat("dd/MM/yyyy").format(date) +" " + String.format("%.2f", gpa);
        
    }

    public float getGpa() {
        return gpa;
    }
    
    public String chuanhoa(){
        String d[] = name.split("\\s+");
        String res = "";
        for (String i : d) {
            res += i.substring(0,1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        return res.trim();
        
    }
    @Override
    public int compareTo(SinhVien a){
        if(this.gpa < a.getGpa()) return 1;
        
        return -1;
    }
    public SinhVien() {
    }
    
}