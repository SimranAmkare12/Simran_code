package final_keyword_example;



public class Final_variable {
	
	 final double  pi = 3.14 ;
	
	 
	 
	 public double calculate_area(int r ){
		double  area = pi * r* r;
		 return area;
	 }
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final_variable p = new Final_variable();
	double tt =	p.calculate_area(2);
		System.out.println("Area is  "+tt);

	}


}
