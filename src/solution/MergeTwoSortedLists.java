package solution;

public class MergeTwoSortedLists {
	
	public static void main(String[] args) {
		ListNode L1head = new ListNode(-9);
		L1head.next = new ListNode(3);
		
		ListNode L2head = new ListNode(5);
		L2head.next = new ListNode(7);
		
		MergeTwoSortedLists obj = new MergeTwoSortedLists();
		ListNode merged = obj.mergeTwoLists(L1head, L2head);
		obj.print(merged);
		
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(Integer.MIN_VALUE); //new list
		ListNode head = result; // Points to the beginning of the new list
		
		while(l1 != null && l2 != null) {
			if(l1.val <= l2.val) {
				result.next = l1;
				l1 = l1.next;
			} else {
				result.next = l2;
				l2 = l2.next;
			}
			result = result.next;
		}
		
		while(l1 != null) {
			result.next = l1;
			l1 = l1.next;
			result = result.next;
		}
		while(l2 != null) {
			result.next = l2;
			l2 = l2.next;
			result = result.next;
		}
		
		return head.next;
		
	}
	
	public void print(ListNode l1) {
		ListNode current = l1;
		while(current != null) {
			System.out.println(current.val);
			current = current.next;
		}
	}
	
	
}

