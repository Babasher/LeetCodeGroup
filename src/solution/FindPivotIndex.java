package solution;

public class FindPivotIndex {
	public static void main(String[] args) {
		FindPivotIndex obj = new FindPivotIndex();
		int result = obj.pivotIndex(new int[] {1, 7, 3, 6, 5, 6});
		System.out.println(result);
	}
	
	public int pivotIndex(int[] nums) {
		int leftSum = 0;
		int rightSum = 0;
		
		for(int i : nums) {
			rightSum += i; //will be right pointer, with the sum of the entire array
		}
		
		for(int i = 0; i < nums.length; i++) {
			rightSum -= nums[i]; //rightSum gets smaller on each iteration
			if(rightSum == leftSum) { //Once they're the same
				return i; //return where it happened
			}
			
			leftSum += nums[i]; //leftSum grows bigger on each iteration
		}
		
		return -1;
		
	}
}
