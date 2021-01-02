package solution;

public class PathSum {
	public static void main(String[] args) {
		PathSum obj = new PathSum();
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(1);
		root.right = new TreeNode(2);
		
		System.out.println(obj.hasPathSum(root, 6));
		
	}
	
	public boolean hasPathSum(TreeNode root, int sum) {
		int result = this.findPathSum(root, 0, sum);
		System.out.println(result);
		return result == sum;
	}
	
	public int findPathSum(TreeNode root, int accu, int sum) {
		System.out.println(accu);
		
		if(root == null) {
			return accu;
		}
		
		accu += root.val;
		findPathSum(root.left, accu, sum);
		findPathSum(root.right, accu, sum);
		
		if(accu == sum && root.left == null && root.right == null) {
			System.out.println("Hello");
			return accu;
		}
		
		if(accu == sum) return accu;
		return 0;
		
	}

}
