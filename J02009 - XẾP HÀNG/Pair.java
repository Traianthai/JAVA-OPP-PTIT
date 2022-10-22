
package xephang;

/**
 *
 * @author ADMIN
 */
public class Pair implements Comparable<Pair>{
    public int t;
    public int d;

    public Pair(int t, int d) {
        this.t = t;
        this.d = d;
    }

    @Override
    public int compareTo(Pair o) {
        if(this.t < o.t) return -1;
        if(this.t > o.t) return 1;
        return 0;
    }
    
}
