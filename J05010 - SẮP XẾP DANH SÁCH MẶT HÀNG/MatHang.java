package a;





public class MatHang implements Comparable<MatHang>{
    private String id , name, nhom;
    private float giamua, giaban;

    public MatHang() {
    }

    public MatHang(String id, String name, String nhom, float giamua, float giaban) {
        this.id = id;
        this.name = name;
        this.nhom = nhom;
        this.giamua = giamua;
        this.giaban = giaban;
    }
    public float loinhuan(){
        return giaban - giamua;        
    }
    @Override
    public int compareTo(MatHang o) {
        if(this.loinhuan() < o.loinhuan()) return 1;
        return -1;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + nhom + " " + String.format("%.2f", loinhuan());
    }
}
//3
//May tinh SONY VAIO
//Dien tu
//16400
//17699
//Tu lanh Side by Side
//Dien lanh
//18300
//25999
//Banh Chocopie
//Tieu dung
//27.5
//37
