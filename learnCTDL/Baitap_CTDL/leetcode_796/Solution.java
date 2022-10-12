class Solution {
    public boolean rotateString(String s, String goal) {
        
        String a = s + s;
        if (a.contains(goal) == true && s.length() == goal.length())
            return true;
        return false;
        
    }
}