package solution;

import java.util.LinkedList;
import java.util.Queue;

public class CousinsInBinaryTree {
	public static void main(String[] args) {
		
	}
	
	public boolean isCousins(TreeNode root, int x, int y) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int genPop = 1;
		while(!queue.isEmpty()) {
			if(genPop == 0) {
				genPop = queue.size();
			}
			TreeNode n = queue.remove();
			genPop--;
			int target = -1;
			if(n.left != null) {
				if(n.left.val == x) {
					target = y;
				} else if(n.left.val == y) {
					target = x;
				} else {
					queue.add(n.left);
				}
				queue.add(n.left);
			}
			if(n.right != null) {
				if(n.right.val == x) {
					target = y;
				} else if (n.right.val == y) {
					target = x;
				} else {
					queue.add(n.right);
				}
				queue.add(n.right);
			}
			
			if(target != -1) {
				while(genPop > 0) {
					n = queue.remove();
					genPop--;
					if(n.left != null && n.left.val == target) return true;
					if(n.right != null && n.right.val == target) return true;
				}
				return false;
			}
		}
		return false;
	}
}
