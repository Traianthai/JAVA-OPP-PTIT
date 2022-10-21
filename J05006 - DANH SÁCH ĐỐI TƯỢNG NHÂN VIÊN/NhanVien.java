package a;


public class NhanVien {

    private String id, name, gt, ngaysinh, diachi, mst, ngayki;
   

    public NhanVien() {
    }

    public NhanVien(String id, String name, String gt, String ngaysinh, String diachi, String mst, String ngayki) {
        this.id = id;
        this.name = name;
        this.gt = gt;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.mst = mst;
        this.ngayki = ngayki;
    }

    
    
    @Override
    public String toString(){
        return id + " " + name + " " + gt + " " + ngaysinh + " " + diachi + " " + mst + " " + ngayki;
        
    }
    
}
//3
//Nguyen Van A
//Nam
//22/10/1982
//Mo Lao-Ha Dong-Ha Noi
//8333012345
//31/12/2013
//Ly Thi B
//Nu
//15/10/1988
//Mo Lao-Ha Dong-Ha Noi
//8333012346
//22/08/2011
//Hoang Thi C
//Nu
//04/02/1981
//Mo Lao-Ha Dong-Ha Noi
//8333012347
//22/08/2011