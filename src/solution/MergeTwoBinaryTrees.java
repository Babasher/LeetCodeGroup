package solution;

public class MergeTwoBinaryTrees {
	public static void main(String[] args) {
		
		MergeTwoBinaryTrees obj = new MergeTwoBinaryTrees();
		TreeNode head = new TreeNode(1);
			head.right = new TreeNode(2);
			head.left = new TreeNode(3);
		TreeNode head2 = new TreeNode(2);
			head.left = new TreeNode(1);
			head.right = new TreeNode(3);
		
		TreeNode merged = obj.mergeTrees(head,head2);
	}
	
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if(t1 == null) {
			return t2;
		}
		if(t2 == null) {
			return t1;
		}
		
		t1.val = t1.val + t2.val;
		
		t1.left = mergeTrees(t1.left, t2.left);
		t1.right = mergeTrees(t2.right, t2.right);
		
		return t1;
		
    }
}
