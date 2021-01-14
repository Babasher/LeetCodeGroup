package solution;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		LongestCommonPrefix obj = new LongestCommonPrefix();
		String[] prefix = {"dog","racecar","car"};
		String result = obj.longestCommonPrefix(prefix);
		System.out.println(result);
	}
	
	public String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length == 0) { 
			return "";
		}
		
		String prefix = strs[0]; // flower
		
		for(int i = 0; i < strs.length; i++) {
			int ctr = 0;
			while(ctr < prefix.length() &&
				  ctr < strs[i].length() &&
				  prefix.charAt(ctr) == strs[i].charAt(ctr)) {
				ctr++;
			}
			prefix = prefix.substring(0, ctr);
		}
		
		return prefix;
	}
}
