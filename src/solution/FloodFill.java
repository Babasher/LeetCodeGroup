package solution;

public class FloodFill {
	public static void main(String[] args) {
		FloodFill obj = new FloodFill();
		int[][] image = {{1,1,1}, {1, 1, 0}, {1, 0, 1}};
		int[][] filled = obj.floodFill(image, 1, 1, 2);
		
		for(int row = 0; row < filled.length; row++) {
			for(int column = 0; column < filled[row].length; column++) {
				System.out.print(filled[row][column]);
			}
			System.out.println();
		}
	}
	
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		if(image[sr][sc] == newColor) {
			return image;
		}
		
		fill(image, sr, sc, image[sr][sc], newColor);
	
		return image;
    }
	
	public void fill(int[][] image, int x, int y, int color, int newColor) {
		if(x < 0 || y < 0 || x >= image.length || y >= image[0].length || image[x][y] != color) {
			return;
		}
		
		image[x][y] = newColor;
		
		fill(image, x - 1, y, color, newColor);
		fill(image, x + 1, y, color, newColor);
		fill(image, x, y - 1, color, newColor);
		fill(image, x, y + 1, color, newColor);
	
	}
}
