package solution;

import java.util.Arrays;

public class MoveZeroes {
	public static void main(String[] args) {
		MoveZeroes obj = new MoveZeroes();
		obj.moveZeroes(new int[] {0, 1, 0, 3, 12});
	}
	
	public void moveZeroesv2(int[] nums) {
		int numOfZeroes = this.findZeroes(nums);
		int ctr = 0;
		
		while(ctr < numOfZeroes) {
			for(int i = 0; i < nums.length; i++) {
				if(nums[i] == 0 && i != nums.length - 1) { //if the value is zero and not at the end
					int temp = nums[i + 1]; //keep track of original number
					nums[i + 1] = nums[i]; //move the zero up space
					nums[i] = temp; //store the original number back into place
				}
			}
		}
		
		
		System.out.println(Arrays.toString(nums));
	}
	
	public int findZeroes(int[] nums) {
		int ctr = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 0) {
				ctr++;
			}
		}
		return ctr;
	}

	public void moveZeroes(int[] nums) { 
		int index = 0;
		for(int i = 0; i < nums.length; i++) { 
			if(nums[i] != 0) {
				nums[index++] = nums[i];
			}
		}
		
		for(; index < nums.length; index++) {
			nums[index] = 0;
		}
		
		System.out.println(Arrays.toString(nums));
	}
}


