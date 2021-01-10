package solution;

public class MaximumDepthBinaryTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.right = new TreeNode(7);
		root.right.left = new TreeNode(15);
		
		MaximumDepthBinaryTree obj = new MaximumDepthBinaryTree();
		System.out.println(obj.maxDepth(root, 0));
	}
	
	public int maxDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		if(root.left == null && root.right == null) {
			return 1;
		}
		
		
		return this.maxDepth(root, 0);
    }
	
	public int maxDepth(TreeNode root, int ctr) {
		if(root == null) {
			return ctr;
		}
		
		int left = maxDepth(root.left, ctr + 1);
		int right = maxDepth(root.right, ctr + 1);
		
		return Math.max(left, right);
	}
}
