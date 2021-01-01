package solution;

import java.util.Arrays;

public class RunningSum {
	public static void main(String[] args) {
		RunningSum obj = new RunningSum();
		System.out.println(Arrays.toString(obj.runningSum(new int[] {3,1,2,10,1})));
	}
	
	public int[] runningSum(int[] nums) {
		int[] result = new int[nums.length];
		result[0] = nums[0];
		for(int i = 1; i < nums.length; i++) {
			result[i] = nums[i] + result[i - 1];
		}
		
		return result;
	}
}
