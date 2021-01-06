package solution;

import java.util.*;

public class SelfDividingNumber {
	public static void main(String[] args) {
		SelfDividingNumber obj = new SelfDividingNumber();
		List<Integer> nums = obj.selfDividingumbers(1, 100);
		System.out.println(nums.toString());
		
		
	}
	
	public List<Integer> selfDividingumbers(int left, int right) {
		List<Integer> nums = new ArrayList<>();
		for(int i = left; i < right; i++) {
			if(this.isDividingNumber(i)) {
				nums.add(i);
			}
		}
		nums.add(right);
		return nums;
    }
	
	public boolean isDividingNumber(int x) {
		int originalNumber = x;
		while(x != 0) {
			int lastDigit = x % 10;
			if(lastDigit == 0) {
				return false;
			}
			if(originalNumber % lastDigit != 0) {
				return false;
			}
			x = x/10;
		}
		
		return true;
	}
}
