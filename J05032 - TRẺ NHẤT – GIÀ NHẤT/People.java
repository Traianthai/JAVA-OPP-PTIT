package a;


import java.util.Date;

public class People implements Comparable<People>{
    private String name;
    private Date ns;

    public People() {
    }

    public People(String name, Date ns) {
        this.name = name;
        this.ns = ns;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(People o) {
        if(this.ns.getTime() < o.ns.getTime()) return 1;
        return -1;
    }
    
}
