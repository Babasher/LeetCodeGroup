package solution;

public class MaximumNestingDepthOfTheParentheses {
	public static void main(String[] args) {
		MaximumNestingDepthOfTheParentheses obj = new MaximumNestingDepthOfTheParentheses();
		int result = obj.maxDepth("(()())");
		System.out.println(result);
	}
	
	public int maxDepth(String s) {
		if(s == "" || (s.length() == 1 && !s.contains("(") && !s.contains(")"))) {
			return 0;
		}
		
		int counter = 0;
		int maxCounter = 0;
		for(int i = 0; i < s.length(); i++) {
			if(counter > maxCounter) {
				maxCounter = counter;
			}
			
			if(s.charAt(i) == '(') {
				counter++;
			} else if(s.charAt(i) == ')') {
				counter--;
			}
		}
		
		return maxCounter;
	}
}
