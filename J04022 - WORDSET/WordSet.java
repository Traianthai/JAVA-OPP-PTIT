package a;


import java.util.TreeSet;


class WordSet {
    private TreeSet <String> set = new TreeSet<>();
    WordSet(String a) {
        String d[] = a.trim().toLowerCase().split("\\s+");
        for (String i : d) {
            set.add(i);
        }
    }

    private WordSet() {
        
    }

    public TreeSet<String> getSet() {
        return set;
    }

    public void setSet(TreeSet<String> set) {
        this.set = set;
    }
    
    WordSet union(WordSet s2) {
        WordSet a = new WordSet();
        TreeSet <String> tmp = new TreeSet<>();
        tmp.addAll(this.set);
        tmp.addAll(s2.getSet());
        a.setSet(tmp);
        return a;
    }

    WordSet intersection(WordSet s2) {
        WordSet a = new WordSet();
        TreeSet <String> tmp = new TreeSet<>();
        
        for (String i : this.set) {
            if(s2.getSet().contains(i)) tmp.add(i);
        }
        a.setSet(tmp);
        return a;
    }
    public String toString(){
        String res = "";
        for (String i : set) {
            res = res + i + " ";
        }
        return res.trim();
    }
}
//Lap trinh huong doi tuong
//Ngon ngu lap trinh C++