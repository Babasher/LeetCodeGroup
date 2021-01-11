package solution;

public class SumOfLeftLeaves {
	public static void main(String[] args) {
		SumOfLeftLeaves obj = new SumOfLeftLeaves();
		TreeNode head = new TreeNode(3);
			head.right = new TreeNode(20);
			head.left = new TreeNode(9);
				head.right.right = new TreeNode(7);
				head.right.left = new TreeNode(15);
		System.out.println(obj.sumOfLeftLeaves(head));
	}

	
	public int sumOfLeftLeaves(TreeNode root) {
		if(root == null) {
			return 0;
		} else if(root.left != null && this.isLeaf(root.left)){
			return root.left.val + sumOfLeftLeaves(root.right);
		}
		
		return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
	
	public boolean isLeaf(TreeNode root) {
		return root.left == null && root.right == null;
	}
	
	
}
