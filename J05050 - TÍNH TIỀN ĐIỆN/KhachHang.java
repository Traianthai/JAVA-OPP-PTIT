package a;



public class KhachHang {
    private String id,sd;
    private long socu,somoi;

    public KhachHang(String id, String sd, long socu, long somoi) {
        this.id = id;
        this.sd = sd;
        this.socu = socu;
        this.somoi = somoi;
    }
    private int getHeso(){
        if(sd.equals("KD")) return 3;
        else if(sd.equals("NN")) return 5;
        else if(sd.equals("TT")) return 4;
        return 2;
    }
    private long getThanhtien(){
        return (somoi - socu)*getHeso()*550;
    }
    
    private long getPhutroi(){
        if((somoi - socu) < 50) return 0;
        else if((somoi - socu) <= 100) return Math.round((float) 35 / 100 * getThanhtien());
        return getThanhtien();
        
    }
    
    private long getTongtien(){
        return getPhutroi() + getThanhtien();
    }
    
    public String toString(){
        return id + " " + getHeso() + " " + getThanhtien() + " " + getPhutroi() + " " + getTongtien();
    }
}




