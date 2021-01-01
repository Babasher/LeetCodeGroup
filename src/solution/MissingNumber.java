package solution;

public class MissingNumber {
	public static void main(String[] args) {
		MissingNumber obj = new MissingNumber();
		int num = obj.missingNumber(new int[] {0, 1, 2, 3});
		System.out.println(num);
	}
	
	public int missingNumber(int[] nums) {
		int n = nums.length;
		int expectedSum = n * (n + 1) / 2; // sum of all numbers from 1 to n

		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		
		return expectedSum - sum;
	}
}
