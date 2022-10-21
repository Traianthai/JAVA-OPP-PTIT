package a;


import java.util.*;
import java.util.Map.Entry;




public class Main {
    public static boolean check(String a){
        for (int i = 0; i < a.length()-1; i++) {
            if(a.charAt(i)> a.charAt(i+1)) return false;
        }
        return true;
    }
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String,Integer> Hm = new LinkedHashMap<>();
        while(sc.hasNext()){
            String res = sc.next();
            if(check(res)){
                if(Hm.containsKey(res)){
                    Hm.put(res, Hm.get(res)+1);
                }else{
                    Hm.put(res, 1);
                }
                
            }
        }
        ArrayList <Entry<String,Integer>> Ar = new ArrayList<>(Hm.entrySet());
        Collections.sort(Ar,new Comparator<Entry<String, Integer>>(){
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                if(o1.getValue() > o2.getValue()) return -1;
                if(o1.getValue() < o2.getValue()) return 1;
                return 0;
            }
            
        });
       
        for (Entry<String, Integer> entry : Ar) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
//<<PI<T>>TVT<<BCa-


