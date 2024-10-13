package dsa;

   public class MergeList {
	   
	   static class  Node{
			int data ;
			Node next ;
			
			 Node(int d){
				data = d ;
				next = null ;
			}
			 public static Node mergeSortList(Node l1 , Node l2) {
				 //l1 - 1  2 3 //merge two sorted list  // l2 - 4, 5, 7 				
				 Node head = null  ;  
				 Node tail = null ;
				  if(l1.data <= l2.data) {
					  head = l1 ; 
					  tail = l1;  
					  l1 = l1.next ;  
				  }
				  else {
					  head = l2 ;
					  tail = l2 ;
					  l2 = l2.next ;
				  }
				  while(l1 != null && l2 != null) {
					  if(l1.data <= l2.data) { 
						  tail.next = l1 ;
						  tail = l1 ;
						  l1 = l1.next ;
					  }
					  else {
						  tail.next = l2 ; 
						  tail= l2 ;
						  l2 = l2.next ; 
					  }					  
				  }
				  if(l1 != null) {
					  tail.next = l1 ;
				  }
				  else {
					  tail.next = l2 ;
				  }
				  
				 return head ;
			 }
		 
		  }
	   
	  
	
	public static void main(String[] args) {
		
		Node head1 = new Node(5);
		head1.next = new Node(6);
		head1.next.next = new Node(7);
		
		Node head2 = new Node(9);
		head2.next = new Node(10);
		head2.next.next = new Node(11);
		
		
		Node m = Node.mergeSortList(head1, head2);
		
		while(m != null ) {
			System.out.print(m.data+" ");
			m = m.next ;
		}
	}

	
	}
	
	

