package solution;

public class RemoveLinkedListElements {
	public static void main(String[] args) {
		ListNode head = new ListNode(6);
		head.next = new ListNode(2);
		head.next.next = new ListNode(6);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(6);
		
		ListNode result = removeElements(head, 6);
		print(result);
	}
	
	public static ListNode removeElements(ListNode head, int val) {
		if(head == null) {
			return null;
		}
		
		ListNode curr = head;
		//Deals with every value after the head
		while(curr.next != null) {
			if(curr.next.val == val) {
				curr.next = curr.next.next; 
			} else {
				curr = curr.next;
			}
		}
		
		//Accounts for if head.val == target
		return head.val == val ? head.next : head;
	}
	
	public static void print(ListNode head) {
		ListNode current = head;
		while(current != null) {
			System.out.println(current.val);
			current = current.next;
		}
	}
}
