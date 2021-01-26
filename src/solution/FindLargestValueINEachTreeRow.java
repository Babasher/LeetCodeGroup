package solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLargestValueINEachTreeRow {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(3);
			root.left.left = new TreeNode(5);
			root.left.right = new TreeNode(3);
		root.right = new TreeNode(2);
		root.right.right = new TreeNode(9);
		
		List<Integer> result = largestValues(root);
		
		System.out.println(result.toString());
		
	}
	
	public static List<Integer> largestValues(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
	
		if(root == null) return result;
	
		queue.add(root);
		while(!queue.isEmpty()) {
			int queueSize = queue.size();
			int maxValue = Integer.MIN_VALUE;
			
			
			for(int i = 0; i < queueSize; i++) {
				TreeNode currentNode = queue.remove();
				if(maxValue < currentNode.val) {
					maxValue = currentNode.val;
				}
				
				if(currentNode.left != null) {
					queue.add(currentNode.left);
				}
				if(currentNode.right != null) {
					queue.add(currentNode.right);
				}
			}
			result.add(maxValue);
		}
		return result;
		
	}
	
	public List<Integer> largestValues2(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		if(root == null) {
			return result;
		}
		
		Queue<TreeNode> nodes = new LinkedList<>();
		nodes.add(root);
		
		
		while(!nodes.isEmpty()) {
			int maximumValue = Integer.MIN_VALUE;
			int size = nodes.size();
			for(int i = 0; i < size; i++) {
				TreeNode currentNode = nodes.remove();
				//maximumValue = Math.max(currentNode.val, maximumValue);
				if(maximumValue < currentNode.val) {
					maximumValue = currentNode.val;
				}
				
				if(currentNode.left != null) {
					nodes.add(currentNode.left);
				}
				if(currentNode.right != null) {
					nodes.add(currentNode.right);
				}
				
			}
			result.add(maximumValue);
		}
		return result;
		
	}
}
