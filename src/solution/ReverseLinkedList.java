package solution;

public class ReverseLinkedList {
	public static void main(String[] args) {
		ReverseLinkedList obj = new ReverseLinkedList();
		
		ListNode head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		obj.print(obj.reverseList(head));
		
	}
	
	public ListNode reverseList(ListNode head) {
		ListNode previous = null;
		ListNode current = head;
		ListNode next = head;
		
		while(current != null) {
			next = next.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		
		return previous;
	}
	
	
	
	public void print(ListNode head) {
		ListNode current = head;
		while(current != null) {
			System.out.println(current.val);
			current = current.next;
		}
	}
	
	
	
}
