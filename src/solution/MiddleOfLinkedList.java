package solution;

public class MiddleOfLinkedList {
	public static void main(String[] args) {
		MiddleOfLinkedList obj = new MiddleOfLinkedList();
		ListNode head = new ListNode(1);
//		head.next = new ListNode(2);
//		head.next.next = new ListNode(3);
//		head.next.next.next = new ListNode(4);
//		head.next.next.next.next = new ListNode(5);
//		head.next.next.next.next.next = new ListNode(6);
		
		System.out.println(obj.middleNode(head).val);
	}
	
	public ListNode middleNode(ListNode head) {
		ListNode pointer = head;
		int size = 0;
		
		//Find the value of the pointer
		while(pointer != null) {
			size += 1;
			pointer = pointer.next;
		}
		
		pointer = head; //reset the position of pointer
		int ctr = 0;
		while(ctr < size / 2) {
			pointer = pointer.next;
			ctr++;
		}
		
		return pointer;
    }
}
