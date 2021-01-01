package solution;

public class PeakIndexMountain {
	public static void main(String[] args) {
		PeakIndexMountain obj = new PeakIndexMountain();
		int peak = obj.peakIndexInMountainArray(new int[] {0, 1, 0});
		System.out.print(peak);
	}
	
	public int peakIndexInMountainArray(int[] arr) {
	        int maxPeak = Integer.MIN_VALUE;
			int maxIndex = 0;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] >= maxPeak) {
					maxPeak = arr[i];
					maxIndex = i;
				}
			}
			
			return maxIndex;
	}
}
