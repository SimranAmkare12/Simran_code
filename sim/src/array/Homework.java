package array;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("===================");  
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int row = arr.length;
		int col= arr[0].length;
		for(int i=0; i<row;i++) {
			if(i==0) {
				for(int j=col-1;j>=0;j--) {
					System.out.print(arr[j][i]+" ");
					
				}
				for(int j =1;j<col;j++) {
					System.out.print(arr[i][j]+" ");
					
				}
			}
			else {
				for(int j =2;j>0;j--) {
					if(i==2||j==2) {
						System.out.print(arr[i][j]+" ");
					}
				}
			}
		}
		
		
				System.out.println();
				System.out.println("===================");  
				System.out.println(" N translation");
				System.out.println("st");
				for(int i=0; i<col;i++) {
					if(i==0) {
						for(int j=row-1;j>=0;j--) {
							System.out.print(arr[j][i]+" ");
						}
					}
					for(int j=1 ; j>0 ;j--) {
						if(i==j) {
							System.out.print(arr[i][j]+" ");
						}
						
					}
					if(i==2) {
						for(int j= 2 ;j >=0 ;j--) {
							System.out.print(arr[j][i]+" ");
						}
					}
          	}	
				
				
				System.out.println();
				System.out.println("===================");  
				System.out.println(" reverse ");
				for(int i=0; i<col;i++) {
					if(i==0) {
						for(int j=0;j<row;j++) {
							System.out.print(arr[j][i]+" ");
						}
					}
					for(int j=1 ; j>0 ;j--) {
						if(i==j) {
							System.out.print(arr[i][j]+" ");
						}
						
					}
					if(i==2) {
						for(int j= 0 ;j <col ;j++) {
							System.out.print(arr[j][i]+" ");
						}
					}
				}
				System.out.println();
				System.out.println("===================");  
				System.out.println("  ");
				
				System.out.println();                           //doubt
				System.out.println("===============");
				System.out.println("ZIG ZAG traverse......");

				
				
				//end code
}
	}


