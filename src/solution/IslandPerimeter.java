package solution;

public class IslandPerimeter {
	public static void main(String[] args) {
		IslandPerimeter obj = new IslandPerimeter();
		int[][] island = {{0, 1, 0, 0},
						{1, 1, 1, 0},
						{0, 1, 0, 0},
						{1, 1, 0, 0}};
		int perimeter = obj.islandPerimeter(island);
		System.out.println(perimeter);
	}
	
	public int islandPerimeter(int[][] grid) {
		int result = 0;
		for(int row = 0; row < grid.length; row++) {
			for(int column = 0; column < grid[row].length; column++) {
				if(grid[row][column] == 1) {
					result += 4;
					
					if(row > 0 && grid[row - 1][column] == 1) { //Checks the row above
						result -= 2;
					}
					
					if(column > 0 && grid[row][column - 1] == 1) { //Checks the column to the left
						result -= 2;
					}
				}	
			}
		}
		return result;
	}
}
