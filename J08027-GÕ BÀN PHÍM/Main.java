package gobanphim;

import java.util.*;




public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Deque <Character> ql = new LinkedList<>();
        Deque <Character> qr = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '<' && ql.size() > 0){
                qr.addFirst(ql.removeFirst());
            }else if(s.charAt(i) == '>' && qr.size() > 0){
                ql.addFirst(qr.removeFirst());
            }else if(s.charAt(i) == '-' && ql.size() > 0){
                ql.removeFirst();
            }else if(Character.isLetterOrDigit(s.charAt(i))){
                ql.addFirst(s.charAt(i));
            }
        }
        while(ql.size() > 0){
            System.out.print(ql.removeLast());
        }
        while(qr.size() > 0){
            System.out.print(qr.removeFirst());
        }
    }
}
//<<PI<T>>TVT<<BCa-


