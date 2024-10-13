package practices;

public class RemoveDuplicateFromArray {

	
	public int remove(int arr[]) { // 1 1 2
		
		 int i = 1 ;
		 for(int j =1 ; j < arr.length ;j++ ) {
			 if(arr[j] != arr[i-1]) {
				arr[i] = arr[j]; 
				i++;
			 }
		 }
		return  i ;
	}
	
	public static void main(String[] args) {

         int arr[] = {1, 1, 2,3};
         RemoveDuplicateFromArray obj = new RemoveDuplicateFromArray();
         int result = obj.remove(arr);
         System.out.println(result);
	}

}
