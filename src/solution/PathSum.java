package solution;

public class PathSum {
	public static void main(String[] args) {
		PathSum obj = new PathSum();
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(4);
		
		System.out.println(obj.hasPathSum(root, 9));
		
	}
	
	public boolean hasPathSum(TreeNode root, int sum) {
		if(root == null) {
			return false;
		}
		
		if(root.val == sum && root.left == null && root.right == null) { //ensures were on a leaf and path exists
			return true;
		}
		
		boolean left = hasPathSum(root.left, sum - root.val);
		boolean right = hasPathSum(root.right, sum - root.val);
		
		return left || right;
	}
	

}
