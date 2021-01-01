package solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static void main(String[] args) {
		TwoSum obj = new TwoSum();
		int[] nums = {3,4,3};
		
		System.out.println(Arrays.toString(obj.twoSum2(nums, 6)));
	}
	
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> c = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			c.put(nums[i], i);
		}
		
		for(int i = 0; i < nums.length; i++) {
			int difference = target - nums[i];
			if(c.containsKey(difference) && c.get(difference) != i) {
				return new int[] { c.get(target - nums[i]), i};
			}
		}
		throw new IllegalArgumentException("No two sums");
		

	}
	
	public int[] twoSum2(int[] nums, int target) {
		Map<Integer, Integer> c = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			int difference = target - nums[i];
			
			if(c.containsKey(difference) && c.get(difference) != i) {
				return new int[] {c.get(difference), i};
			}
			c.put(nums[i], i);
		}
		
		throw new IllegalArgumentException("No two sums");
		

	}
}
