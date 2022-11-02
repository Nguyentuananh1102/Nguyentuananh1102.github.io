import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public static boolean backspaceCompare(String s, String t) {
        Deque<Character> s1=new LinkedList<>();
        Deque<Character> t1=new LinkedList<>();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='#') {
                if(!s1.isEmpty()) {
                    s1.pop();                
                }
            } else {
                s1.push(s.charAt(i));
            }
        }
        for(int i=0;i<t.length();i++) {
            if(t.charAt(i)=='#') {
                if(!t1.isEmpty()) {
                    t1.pop();                
                }
            } else {
                t1.push(t.charAt(i));
            }
        }
        while(!s1.isEmpty() && !t1.isEmpty()) {
             if(s1.pop()!=t1.pop()) {
                 return false;
             }
        }
        return s1.isEmpty() && t1.isEmpty();
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s, t));
    }
}