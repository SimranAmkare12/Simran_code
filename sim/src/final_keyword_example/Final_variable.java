package final_keyword_example;



public class Final_variable {
	
	 final double  pi = 3.14 ;
	 int r = 2 ;
	 
	 
	 public double calculate_area(){
		double  area = pi * r* r;
		 return area;
	 }
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final_variable p = new Final_variable();
	double tt =	p.calculate_area();
		System.out.println("Area is  "+tt);

	}


}
