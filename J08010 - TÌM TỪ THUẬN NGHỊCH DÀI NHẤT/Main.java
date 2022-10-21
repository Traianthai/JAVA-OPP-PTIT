package a;


import java.util.*;




public class Main {
    public static boolean check(String a){
        for (int i = 0; i < a.length()/2; i++) {
            if(a.charAt(i) != a.charAt(a.length()-1-i)) return false;
        }
        return true;
    }
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String,Integer> Hm = new LinkedHashMap<>();
        int len = 0;
        while(sc.hasNext()){
            String res = sc.next();
            if(check(res) && res.length() >= len){
                len = res.length();
                if(Hm.containsKey(res)){
                    Hm.put(res, Hm.get(res)+1);
                }else{
                    Hm.put(res, 1);
                }
                
            }
        }
        for(Map.Entry<String, Integer> entry : Hm.entrySet()){
            if(entry.getKey().length()== len) 
                System.out.println(entry.getKey()+ " " + entry.getValue());
        
        }
        
    }
}
//<<PI<T>>TVT<<BCa-


