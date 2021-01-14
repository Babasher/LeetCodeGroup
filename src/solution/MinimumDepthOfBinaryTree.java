package solution;

public class MinimumDepthOfBinaryTree {
	public static void main(String[] args) {
		MinimumDepthOfBinaryTree obj = new MinimumDepthOfBinaryTree();
		TreeNode head = new TreeNode(3);
		head.left = new TreeNode(9);
		head.right = new TreeNode(20);
		head.right.left = new TreeNode(15);
		head.right.right = new TreeNode(7);
		
	}
	
	public int minDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		
		if(root.left == null) {
			return minDepth(root.right) + 1;
		} else if (root.right == null) {
			return minDepth(root.left) + 1; 
		}
		
		return Math.min(minDepth(root.left), minDepth(root.right));
	}
}
