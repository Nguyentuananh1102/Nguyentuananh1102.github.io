import java.util.HashSet;
import java.util.Set;

class Solution {
	public static int numUniqueEmails(String[] emails) {
		Set<String> set = new HashSet();

		for(String s : emails) {
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<s.length(); i++) {
				char c = s.charAt(i);
				if(c == '+' || c == '@') {
					sb.append('@');
					i = s.indexOf("@") + 1;
					sb.append(s.substring(i));
					break;
				} else if(c != '.'){
					sb.append(c);    
				}
			}
			set.add(sb.toString());
		}
		return set.size();
	}

    public static void main(String[] args) {
        String [] emails = {"test.email+alex@leetcode.com",
                            "test.e.mail+bob.cathy@leetcode.com",
                            "testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));                    
    }

}