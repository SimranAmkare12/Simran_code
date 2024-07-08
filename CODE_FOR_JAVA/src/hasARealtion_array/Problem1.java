package hasARealtion_array;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]=new int[10];
		int num = 1 ;
		int x = 1 ;
		
		for(int  i = 0 ; i<arr.length ; i++) {
			arr[i] =  num *23 ;
			num++;
			
		}
		
		//reversing
		for(int i =arr.length-1 ; i >= 0 ; i--) {
			System.out.print(arr[i]+" ");
		}
		
        System.out.println();
        
        
        //converting
        for(int i = 0 ; i< arr.length ; i++) {
        	arr[i] = x *17 ;
        	x++ ;
        }
        
        for(int i = arr.length-1 ; i>=0 ; i--) {
        	System.out.print(arr[i]+" ");
        	
        }         
		
		
	
		
	}

}
