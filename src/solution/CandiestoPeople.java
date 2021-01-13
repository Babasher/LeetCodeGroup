package solution;

import java.util.Arrays;

public class CandiestoPeople {
	public static void main(String[] args) {
		CandiestoPeople obj = new CandiestoPeople();
		System.out.println(Arrays.toString(obj.distributeCandies(60, 4)));
	}
	
	public int[] distributeCandies(int candies, int num_people) {
		int[] result = new int[num_people];
		int position = 0;
		int candy = 1;
		
		while(candies > 0) {
			if(candies >= candy) {
				result[position] += candy;
				candies -= candy;
			} else {
				result[position] += candies;
				candies = 0;
			}
			
			if(position == num_people - 1) {
				position = -1;
			}
			
			position++;
			candy++;
		}
		
		return result;

    }
}
