package a;

import java.util.*;

class IntSet {
    private TreeSet<Integer> set = new TreeSet<>();
    
    IntSet(int[] a) {
        for (int i : a) {
            set.add(i);
        }
    }

    public TreeSet<Integer> getSet() {
        return set;
    }

    public void setSet(TreeSet<Integer> set) {
        this.set = set;
    }

    public IntSet() {
        
    }
    
    IntSet union(IntSet s2) {
        IntSet e = new IntSet();
        TreeSet<Integer> res = new TreeSet<>();
        res.addAll(s2.getSet());
        res.addAll(this.set);
        e.setSet(res);
        return e;
    }
    @Override
    public String toString(){
        String res = "";
        for (Integer i : set) {
            res = res + i + " ";
        }
        return res.trim();
    }
}
