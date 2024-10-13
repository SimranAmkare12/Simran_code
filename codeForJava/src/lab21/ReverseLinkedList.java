package lab21;

public class ReverseLinkedList {

	static class Node{
		int data ;
		Node next ;
		Node(int d  ){
			data = d;
			next = null ;
		}	
	}
	public static Node print (Node head) {
		
		Node current = head ;
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next ;
		}
		return head;
		
	}
	
	public static Node reverse(Node head) {
		Node current = head ;
		Node pre = null ;
		Node next ;
		while(current != null) {
		   next = current.next;    		 
   		   current.next = pre ;    		 
   		   pre = current ;    		
   		   current = next ;
		}
		
		return pre;
		
	}
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		
		print(head);
		
		print(reverse(head));
		
	}
}

