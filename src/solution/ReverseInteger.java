package solution;

public class ReverseInteger {
	public static void main(String[] args) {
		ReverseInteger obj = new ReverseInteger();
		System.out.println(obj.reverse(123));
	}
	
	public int reverse(int x) {
		int temp;
		boolean isNegative = false; 
		if(x < 0) {
			temp = -x;
			isNegative = true;
		} else {
			temp = x;
		}
		
		int lastDigit = 0;
		
		long reversed = 0;
		while(temp > 0) {
			lastDigit = temp % 10;
			reversed = reversed * 10 + lastDigit;
			temp = temp / 10;
		}
		
		if(isNegative) { reversed = -reversed; }
		
		return ((int) reversed == reversed) ? (int) reversed : 0;
	}
}
