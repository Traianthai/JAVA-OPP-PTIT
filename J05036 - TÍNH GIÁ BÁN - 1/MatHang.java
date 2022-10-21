package a;



public class MatHang {
    private String id,name,dv;
    private int dongia,soluong;

    public MatHang() {
    }

    public MatHang(String id, String name, String dv, int dongia, int soluong) {
        this.id = id;
        this.name = name;
        this.dv = dv;
        this.dongia = dongia;
        this.soluong = soluong;
    }

    
    public int getPhivc(){
        return (int) Math.round(dongia*soluong*0.05);
    }
    public int Thanhtien(){
        return (int)Math.round(dongia*soluong + getPhivc());
    }
    public int getGiaban(){
        return (int) Math.round(Thanhtien()*1.02);
    }
    @Override
    public String toString(){
        return id + " " + name + " " + dv + " " + getPhivc() + " " + Thanhtien()+ " " + getGiaban();
    }
}