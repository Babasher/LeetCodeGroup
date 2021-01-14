package solution;

public class CountTheNumberOfConsistentStrings {

	public static void main(String[] args) {
		String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};
		String allowed = "cad";
		
		CountTheNumberOfConsistentStrings obj = new CountTheNumberOfConsistentStrings();
		int result = obj.countConsistentStrings(allowed, words);
		System.out.println(result);
	}
	
	public int countConsistentStrings(String allowed, String[] words) {
		int result = 0;
		
		for(int i = 0; i < words.length; i++) {
			int counter = 0;
			for(int j = 0; j < words[i].length(); j++) {
				if(!allowed.contains(String.valueOf(words[i].charAt(j)))) {
					counter += 1;
				}
			}
			
			if(counter == 0) {
				result++;
			}
		}
		return result;
		
    }
	

	
}

