package a;


import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
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
    public String toString(){
        return "B20DCCN" + new DecimalFormat("#000").format(ma) + " " + name + " " + lop + " " 
        + new SimpleDateFormat("dd/MM/yyyy").format(date) +" " + String.format("%.2f", gpa);
        
    }
    public SinhVien() {
    }
    
}