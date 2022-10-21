package a;



public class MatHang {
    private String id;
    private int sl;

    public MatHang() {
    }

    public MatHang(String id, int sl) {
        this.id = id;
        this.sl = sl;
    }
    private int getSoluong(){
        if(id.charAt(0) == 'A') return (int) Math.round(sl*0.6);
        return (int) Math.round(sl*0.7);
    }
    
    private int getDongia(){
        if(id.charAt(id.length()-1) == 'Y') return 110000;
        else return 135000;
        
    }
    
    private int getTien(){
        return getDongia()*getSoluong();
    }
    private int getThue(){
        if(id.charAt(0) == 'A' && id.charAt(id.length()-1) == 'Y') return (int) (0.08*getTien());
        else if(id.charAt(0) == 'A' && id.charAt(id.length()-1) == 'N') return (int) (0.11*getTien());
        else if(id.charAt(0) == 'B' && id.charAt(id.length()-1) == 'Y') return (int) (0.17*getTien());
         return (int) (0.22*getTien());
    }
    public String toString(){
        return id + " " + sl + " " + getSoluong() + " " + getDongia() + " " + getTien() + " " + getThue();
    }
}