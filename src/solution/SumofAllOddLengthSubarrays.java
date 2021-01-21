package solution;

public class SumofAllOddLengthSubarrays {
	public static void main(String[] args) {
		SumofAllOddLengthSubarrays obj = new SumofAllOddLengthSubarrays();
		int[] arr = new int[] {1, 2, 3, 4};
		int result = obj.sumOddLengthSubarrays(arr);
		System.out.println(result);
		
	}
	
	public int sumOddLengthSubarrays(int[] arr) {
		int result = 0;
		int n = arr.length ;
		for(int i = 0; i < n; i++) {
			result += ((i + 1) * (n - i) + 1) / 2 * arr[i];
		}
		
		return result;
	}
}
