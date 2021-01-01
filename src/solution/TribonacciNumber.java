package solution;

import java.util.HashMap;
import java.util.Map;

public class TribonacciNumber {
	public static void main(String[] args) {
		TribonacciNumber obj = new TribonacciNumber();
		System.out.println(obj.tribonacci(35, new HashMap<>()));
		
	}
	
	public int tribonacci(int n, Map<Integer, Integer> solved) {
		
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		if(n == 2) {
			return 1;
		}
		
		if(solved.containsKey(n)) {
			return solved.get(n);
		}
		
		int result = tribonacci(n - 3, solved) + tribonacci(n - 2, solved) + tribonacci(n - 1, solved);
		
		solved.put(n, result);
		
		return result;
	}
}
