package array;

public class Demo {
public static void main(String[] args) {
	System.out.println(" dhj");
	
	
	
	int [] arr2 = {12,24,36};
	for(int j = 0 ;j<arr2.length;j++) {
		if(arr2[j]<16) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("false");
		}
		System.out.println(arr2[j]);
	}
	
	System.out.println(" dhj");
	int [] arr =new int[5];
	arr[0]=1;
	arr[1]=3;
	arr[2]=1;
	arr[3]=5;
	arr[4]=6;
	for(int i =0 ;i <5; i++) {
		System.out.println(""+arr[i]);	
	}
	
	int [] ttt = {34,343,3,543,21,6,2};
	System.out.println("array in reverse order ");
	for(int i=arr.length-1 ; i>0 ; i--) {
		System.out.print(ttt[i]);
	}
	
}

}
