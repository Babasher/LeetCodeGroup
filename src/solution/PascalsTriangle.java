package solution;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public static void main(String[] args) {
		PascalsTriangle obj = new PascalsTriangle();
		List<List<Integer>> triangle = obj.generate(5);
		for(int i = 0; i < triangle.size(); i++) {	
			System.out.println(triangle.get(i).toString());
		}
	}
	
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> triangle = new ArrayList<>();
		List<Integer> first = new ArrayList<>();
		
		if (numRows == 0) {
            return triangle;
        }
		
		first.add(1);
		triangle.add(first);
		
		for(int i = 1; i < numRows; i++) {
			List<Integer> prevRow = triangle.get(i - 1);
			List<Integer> currRow = new ArrayList<>();
			currRow.add(1);
			
			for(int j = 1; j < i; j++) {
				currRow.add(prevRow.get(j - 1) + prevRow.get(j));
			}
			currRow.add(1);
			triangle.add(currRow);
		}
		
		return triangle;
	}
}
