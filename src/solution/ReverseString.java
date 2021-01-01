package solution;

import java.util.Arrays;

public class ReverseString {
	public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		obj.reverseString(new char[] {'H', 'E', 'L', 'L', 'O'});
	}


	public void reverseString(char[] s) {
	    int endCtr = s.length - 1;
		for(int i = 0; i < s.length / 2; i++) {
			char temp = s[i];
			s[i] = s[endCtr];
			s[endCtr] = temp;
			endCtr--;
		}
		
		System.out.println(Arrays.toString(s));
	}
}