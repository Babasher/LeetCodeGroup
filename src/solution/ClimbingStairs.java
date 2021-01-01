package solution;

public class ClimbingStairs {
	public static void main(String[] args) {
		ClimbingStairs obj = new ClimbingStairs();
		obj.runner();
	}
	
	public void runner() {
		System.out.println(this.climbStairs(7));
	}
	
	public int climbStairs(int n) {
		int[] solved = new int[n + 1];
		solved[0] = 1;
		solved[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			solved[i] = solved[i - 1] + solved[i - 2];
		}
		
		return solved[n];
	}
}
