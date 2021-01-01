package solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
	public static void main(String[] args) {
		IntersectionOfTwoArrays obj = new IntersectionOfTwoArrays();
		int[] l1 = {1,2,2,1};
		int[] l2 = {2,2};
		System.out.println(Arrays.toString(obj.intersection(l1, l2)));
	}
	
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> l1 = new HashSet<>();
		Set<Integer> l2 = new HashSet<>();
		
		for(int i = 0; i < nums1.length; i++) {
			l1.add(nums1[i]);
		}
		
		for(int i = 0; i < nums2.length; i++) {
			l2.add(nums2[i]);
		}
		
		l1.retainAll(l2);
		
		int counter = 0;
		int[] result = new int[l1.size()];
		for(int i : l1) {
			result[counter++] =i;
		}
		
		return result;
		
	}
}
