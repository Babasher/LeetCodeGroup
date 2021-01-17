package solution;

public class CountofMatchesInTournament {
	public static void main(String[] args) {
		CountofMatchesInTournament obj = new CountofMatchesInTournament();
		System.out.println(obj.numberOfMatches(14));
	}
	
	public int numberOfMatches(int n) {
		int matches = 0;
		while(n >= 2) {
			if(n % 2 == 0) {
				matches += n/2;
				n = n/2;
			} else {
				matches += (n - 1) / 2;
				n = (n - 1) / 2 + 1;
			}
		}
		
		return matches;
			
	}
}
