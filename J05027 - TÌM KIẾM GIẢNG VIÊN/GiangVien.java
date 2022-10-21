package a;


public class GiangVien implements Comparable<GiangVien>{
    private String id,name,bomon;

    public GiangVien() {
    }

    public GiangVien(String id, String name, String in) {
        this.id = id;
        this.name = name;
        String d[] = in.split("\\s+");
        String res = "";
        for (String i : d) {
            res += i.substring(0, 1).toUpperCase();
        }
        this.bomon = res;
    }

    
    public String getTen(){
        String d[] = name.split("\\s+");
        String ten = "";
        for (String i : d) {
            ten = i;
        }
        return ten;
    }

    public String getName() {
        return name;
    }
    public String getBomon(){
        return this.bomon;
    }
    @Override
    public int compareTo(GiangVien o) {
        if(this.getTen().compareTo(o.getTen()) == 0) return this.id.compareTo(o.id);
        return this.getTen().compareTo(o.getTen());
    }
    @Override
    public String toString(){
        return id + " " + name + " " + bomon;
    }
    
}




