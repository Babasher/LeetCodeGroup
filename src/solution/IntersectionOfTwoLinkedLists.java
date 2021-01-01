package solution;

public class IntersectionOfTwoLinkedLists {
	public static void main(String[] args) {
		IntersectionOfTwoLinkedLists obj = new IntersectionOfTwoLinkedLists();
		ListNode head = new ListNode(4);
			ListNode second = new ListNode(1);
			ListNode third = new ListNode(8);
			ListNode fourth = new ListNode(4);
			ListNode fifth = new ListNode(5);
			
			head.next = second; second.next = third; third.next = fourth; fourth.next = fifth;
			//[4, 1, 8, 4, 5]
			
		ListNode head2 = new ListNode(5);
			ListNode second2 = new ListNode(6);
			ListNode third2 = new ListNode(1);
			
			head2.next = second2; second2.next = third2; third2.next = third;
			//[5, 6, 1, 8, 4, 5]
			
			ListNode intersection = obj.getIntersectionNode(head, head2);
			System.out.println(intersection.val);
	}
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA == null || headB == null) return null;
		
		ListNode aPointer = headA;
		ListNode bPointer = headB;
		
		while(aPointer != bPointer) {
			if(aPointer == null) {
				aPointer = headB;
			} else {
				aPointer = aPointer.next;
			}
			
			if(bPointer == null) {
				bPointer = headA;
			} else {
				bPointer = bPointer.next;
			}
		}
		
		return bPointer;
	}
}	
