package solution;

import java.util.Arrays;
import java.util.*;

public class MaximumProductofThreeNumbers {
	public static void main(String[] args) {
		MaximumProductofThreeNumbers obj = new MaximumProductofThreeNumbers();
		System.out.println(obj.maximumProduct(new int[] {-100,-2,-3,1}));
		
	}
	
	public int maximumProduct(int[] nums) {
		if(nums.length == 3) {
			return nums[0] * nums[1] * nums[2];
		}
	
		
		int maxFirst = Integer.MIN_VALUE;
		int maxSecond = Integer.MIN_VALUE;
		int maxThird = Integer.MIN_VALUE;
		
		int minFirst = Integer.MAX_VALUE;
		int minSecond = Integer.MAX_VALUE;
		int minThird = Integer.MAX_VALUE;
		
		/*
		 * Finds the largest three numbers
		 */
		
		for(int i = 0; i < nums.length; i++) {
			if(maxFirst < nums[i]) {
				maxThird = maxSecond;
				maxSecond = maxFirst;
				maxFirst = nums[i];
			} else if(maxSecond < nums[i]) {
				maxThird = maxSecond;
				maxSecond = nums[i];
			} else if(maxThird < nums[i]) {
				maxThird = nums[i];
			}
			
		}
		
		/*
		 * Finds the smallest three numbers
		 */

		for(int i = 0; i < nums.length; i++) {
			if(minFirst > nums[i]) {
				minThird = minSecond;
				minSecond = minFirst;
				minFirst = nums[i];
			} else if(minSecond > nums[i]) {
				minThird = minSecond;
				minSecond = nums[i];
			} else if(minThird > nums[i]) {
				minThird = nums[i];
			}
		}
		
		
		System.out.println(minFirst + " " + minSecond + " " + minThird);
	
		
		return Math.max(maxFirst * maxSecond * maxThird, maxFirst * minFirst * minSecond);
		
	}
}
