package solution;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
	public static void main(String[] args) {
		FirstUniqueCharacterInAString obj = new FirstUniqueCharacterInAString();
		System.out.println(obj.firstUniqChar("aaleetcode"));
	}
	
	public int firstUniqChar(String s) {
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		for(int i = 0; i < s.length(); i++) {
			char c= s.charAt(i);
			if(map.get(c) == 1) {
				return i;
			}
		}
		
		return -1;
	}
}
