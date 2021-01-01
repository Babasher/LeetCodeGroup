package solution;

import java.util.Arrays;

public class MaximumSubarray {
	public static void main(String[] args) {
		MaximumSubarray obj = new MaximumSubarray();
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.print(obj.maxSubArray(arr));
	}
	
	public int maxSubArray(int[] nums) {
		int maximumSum = Integer.MIN_VALUE;
		int currentSum = 0;
		for(int i = 0; i < nums.length; i++) {
			currentSum = currentSum + nums[i];
			
			if(currentSum > maximumSum) {
				maximumSum = currentSum;
			}
			
			if(currentSum < 0) {
				currentSum = 0;
			}

		}
		return maximumSum;
	}
}
