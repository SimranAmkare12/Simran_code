package lab21;

public class MergetwoSortedList {
   
	static class Node{
		int data ;
		Node next ;
		public Node(int d) {
			data = d ;
			next = null ;
		}
		
		public static Node merge(Node l1 ,Node l2) {
			Node dummy = new Node(0);
			Node current = dummy ;
			
			
			while(l1 != null && l2 != null) {
				if(l1.data < l2.data) {
					current.next = l1 ;   // 1
					l1 = l1.next ; //2
					
				}
				else {
					current.next = l2 ;
					l2 = l2.next ;
				}
				current = current.next ;
				
			}
			if(l1 != null) {
				current.next = l1 ;
			}
			if(l2 != null) {
				current.next = l2 ;
			}
//			while(dummy != null) {
//				System.out.print(dummy.data+" ");
//				dummy = dummy.next ;
//			}
			return dummy.next;
	}
		
		public static void main(String[] args) {
			Node l1 = new Node(2);
			l1.next = new Node(3);
			l1.next.next = new Node(4) ;
			
			Node l2 = new Node(7);
			l2.next = new Node(8);
			l2.next.next = new Node(9) ;
			
		Node m =	merge(l1 ,l2);
		while(m != null) {
			System.out.print(m.data+" ");
			m = m.next ;
		}
			
			
		}
		
	
}
}
