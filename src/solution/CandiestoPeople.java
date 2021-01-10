package solution;

import java.util.Arrays;

public class CandiestoPeople {
	public static void main(String[] args) {
		CandiestoPeople obj = new CandiestoPeople();
		System.out.println(Arrays.toString(obj.distributeCandies(60, 4)));
	}
	
	public int[] distributeCandies(int candies, int num_people) {
		int[] result = new int[num_people];
		
		int candy = 1;
		int position = 0;
		int sum = 0;
		
		while(sum < candies) {
			if(sum + 1 >= candies) {
				result[position] = candies - sum;
			} else {
				result[position] += candy;
			}
			sum += candy;
			candy += 1;
			position ++;
			if(position >= num_people) {
				position = 0;
			}
			
		}
		return result;
    }
}
