package dsa;

public class LinkedList {
	
	static class Node{
		int data ;
		 Node next ;
		 Node(int d){
			 data = d ;
			 next = null ;
		 }//end of cons
	}//end of Node class
	
	// for finding length of list
	public static int lenght(Node head) {
		int size  =0 ;
		while(head != null) {
			size++ ;
			head = head.next ;
		}
		
		return size;
		
	}
	
	// for finding the middle value
	public static  Node middle(Node head) {
		Node slow = head ;
		Node fast = head ;
		
		while(fast != null && fast.next != null  ) {
			fast = fast.next.next ;
			slow= slow.next ;
		}
		return slow;
		
	}
	
	// for deleting middle node
	public static Node deleteMiddle(Node head) {
	
		 Node slow= head ;
		 Node fast = head ;
		 Node pre = null ;
		 while(fast != null && fast.next != null  ) {
			 fast = fast.next.next ;
			 pre = slow ;
			 slow = slow.next ;
		 }
		 pre.next = slow.next ;
		 return head ;
	
	}
	
	// for deleting last element of Node
	public static Node deleteLast(Node head) { // 1 2 3 4
		Node sl = head ;
		while(sl.next.next != null) {
			sl = sl.next;
		}
		sl.next = null ;
		return  head; 
	}
	
	
	
	//for printing node element
	public static Node print(Node head) {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next ;
		}
		return head;
	}
	// remove duplicate from linkedlist   // 1 1 2 
	public static Node removeduplicate(Node head) {
		Node curr = head ;
		while(curr.next != null) {
			if(curr.data == curr.next.data) {
				curr.next= curr.next.next;
			}else {
				curr = curr.next ;
			}
				
		}
		return head ;
	}
	
	//for reversing  linkedlist
	public static Node reverse(Node head) {
		Node curr = head ;
		Node pre = null ;
		Node next ;
		while(curr != null) {
			next = curr.next ;
			curr.next = pre ;
			pre = curr ;
			curr = next ;
		}
		return pre;
	}
	
	public static void main(String[] args) {
		Node head = new Node(12);
		head.next = new Node(24);
		head.next.next = new Node(36);
		head.next.next.next = new Node(36);
		head.next.next.next.next = new Node(60) ;
		
		System.out.print("element of linkedList  --> ");
		print(head);
		
		System.out.println();
		int l = lenght(head);
		System.out.println("lenght of linkedlist is "+l);
		
		System.out.println();
		Node m = middle(head);
		System.out.println("middle element of linkedlist  "+m.data);
		
		System.out.println();
		System.out.println("Removing duplicates from linkedlist ---->");
		print(removeduplicate(head));
		
		System.out.println();
		System.out.print("deleting the middle element of list--> ");
		print(deleteMiddle(head));
		
		System.out.println();
		System.out.print("deleting last element of list --> ");
		print(deleteLast(head));
		
		System.out.println();
		System.out.print("Reversing linkedlist --> ");
		print(reverse(head));
		
		
	}

}
