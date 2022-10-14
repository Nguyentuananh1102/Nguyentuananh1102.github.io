class Solution {
    static int index = 0;

    public static String decodeString(String s) {
        
        StringBuilder result = new StringBuilder();

        while (index < s.length()) {
            char ch = s.charAt(index);
            if (ch >= '0' && ch <= '9') {
                result.append(decodeRepeatedWord(s));
            } else if (ch == ']'){
                index += 1;
                return result.toString();
            } else {
                index += 1;
                result.append(ch);
            }
        }
        return result.toString();
    }

    private static String decodeRepeatedWord(String s) {
        
        int num = 0;
        while(index < s.length()) {
            char ch = s.charAt(index);
            if (ch >= '0' && ch <= '9') {
                num = num * 10 + (ch - '0');
                index += 1;
            } else if (ch == '[') {
                index += 1;
                String word = decodeString(s);
                return word.repeat(num);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(decodeString(s));

    }
}