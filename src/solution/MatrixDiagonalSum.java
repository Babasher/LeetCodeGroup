package solution;

public class MatrixDiagonalSum {
	public static void main(String[] args) {
		int[][] matrix = new int[][] {{7,3,1,9},
									 {3,4,6,9}, 
									 {6,9,6,6},
									 {9,5,8,5}};
									 
		System.out.println(diagonalSum(matrix));
									 
	} 
	
	public static int diagonalSum(int[][] mat) {
		//This one seems to work
		int rightDiagonal = 0;
		for(int i = 0; i < mat.length; i++) {
			rightDiagonal += mat[i][i];
		}
		int leftDiagonal = 0;
		int j = 0;
		for(int i = mat.length - 1; i >=0; i--) {
			leftDiagonal += mat[j][i];
			j++;
		}
		
		//System.out.println("Right Diagonal " + rightDiagonal);
		//System.out.println("Left Diagonal " + leftDiagonal);
		
		int result = leftDiagonal + rightDiagonal;		
		if(mat.length % 2 != 0) {
			int middle = mat.length / 2;
			result -= mat[middle][middle];
		}

		//System.out.println(leftDiagonal);
		return result;
	}
}
