package implemetation;
               //implementaion of linkedlist in java
public class LinkedList {
	 // 12, 13 ,14, 15 
	Node haed ;
	
	static class Node{
		int data ;
		Node next ;
		
		//constructor
		Node(int da){
			this.data = da ;
			next = null ;
		}
		
	} //end of Node class
	
	public static LinkedList insert(LinkedList list ,int data) {
		
		Node new_node = new Node(data);
		
		if(list.haed == null) {
			list.haed = new_node ;
			
		}
		else {
			
			Node last = list.haed;
			while(last.next != null) {
				
				last =last.next;
				
			}
			last.next =  new_node ;
		}
		return list ;
	}// end of insert

	public static void printlist(  LinkedList list) {
		
		Node currentnode = list.haed ;
		System.out.println("linked list start ");
		
		while(currentnode != null) {
			System.out.println(currentnode.data);
			currentnode = currentnode.next ;
			
		}
		
	}// end of printmethod
	
	public static void main(String[] args) {
		 LinkedList list = new  LinkedList() ;
		 
		 list.insert(list, 12);
		 list.insert(list, 13);
		 list.insert(list, 14);
		 list.insert(list, 15);
		
		 printlist(list);
	}
	
}
