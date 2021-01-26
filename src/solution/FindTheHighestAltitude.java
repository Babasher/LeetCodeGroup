package solution;

import java.util.Arrays;

public class FindTheHighestAltitude {
	public static void main(String[] args) {
		//FindTheHighestAltitude obj = new FindTheHighestAltitude();
		System.out.println(largestAltitude(new int[] {-4,-3,-2,-1,4,3,2}));
	}
	
	
	public static int largestAltitude(int[] gain) {
		int[] altitudes = new int[gain.length + 1];
		altitudes[0] = 0;
		
		for(int i = 1; i < gain.length; i++) {
			altitudes[i] = gain[i-1] + altitudes[i-1]; 
		}
		altitudes[altitudes.length - 1] = altitudes[altitudes.length - 2] + gain[gain.length - 1];
		
		
		int maxAltitude = 0;
		for(int i = 0; i < altitudes.length; i++) {
			if (maxAltitude < altitudes[i]) {
				maxAltitude = altitudes[i];
			}
		}
		
		//System.out.println(Arrays.toString(altitudes));
		return maxAltitude;
	
	}
}
