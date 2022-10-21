package a;


public class NhanVien {

    private String id, name;
    private int luong, ngaycong;
    private String chucvu;

    public NhanVien() {
    }

    public NhanVien(String id, String name, int luong, int ngaycong, String chucvu) {
        this.id = "NV" + id;
        this.name = name;
        this.luong = luong;
        this.ngaycong = ngaycong;
        this.chucvu = chucvu;
    }
    public int thuong(){
        if(ngaycong >= 25) return (int) (luong*ngaycong* 0.2);
        else if(ngaycong >= 22)return (int) (luong*ngaycong*0.1);
        return 0;
    }
    public int phucap(){
        if(null == chucvu) return 150000;
        else switch (chucvu) {
            case "GD": return 250000;
            case "PGD": return  200000;
            case "TP": return 180000;
            default: return 150000;
        }
        
    }
    public int thunhap(){
        return thuong() + phucap() + ngaycong*luong;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + luong*ngaycong + " " + thuong() + " " + phucap() + " " + thunhap();
        
        
    }
    
}
//Bui Thi Trang
//45000
//23
//PGD