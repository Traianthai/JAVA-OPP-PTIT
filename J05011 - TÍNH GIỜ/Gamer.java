package a;


import java.util.Date;



public class Gamer implements Comparable<Gamer>{
    private String id,name;
    private Date in,out;

    public Gamer() {
    }

    public Gamer(String id, String name, Date in, Date out) {
        this.id = id;
        this.name = name;
        this.in = in;
        this.out = out;
    }
    public long sogio(){
        long a =  out.getTime() - in.getTime();
        return a/(1000*60);
    }
    public int gio(){
        return (int)sogio()/60;
    }
    public int phut(){
        return (int)sogio()%60;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + gio() + " gio " + phut() + " phut";
    }

    @Override
    public int compareTo(Gamer o) {
        if(this.sogio() > o.sogio()) return -1;
        return 1;
    }
}
//3
//01T
//Nguyen Van An
//09:00
//10:30
//06T
//Hoang Van Nam
//15:30
//18:00
//02I
//Tran Hoa Binh
//09:05
//10:00




