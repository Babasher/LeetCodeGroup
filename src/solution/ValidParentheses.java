package solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args) {
		ValidParentheses obj = new ValidParentheses();
		System.out.print(obj.isValid("]]"));
	}
	
	public boolean isValid(String s) {
		Map<Character, Character> brackets = new HashMap<>();
		brackets.put('[', ']');
		brackets.put('{', '}');
		brackets.put('(', ')');
		
		Stack<Character> cStack = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(cStack.isEmpty() && !brackets.containsKey(c)) {
				return false;
			}
			if(brackets.containsKey(c)) {
				cStack.push(c);
			} else if(brackets.get(cStack.pop()) != c) {
				return false;
			}
		}
		
		if(cStack.isEmpty()) {
			return true;
		}
		return false;
	}
	
}
