package custum_Excetion_example;

public class Animal  {

	void docalculation() throws  WrongCalculation {
		
		int a = 2;
		int b= 3;
		int c= 4;
		
		if(c != 5) {
			throw new  WrongCalculation(" apka ans glt hai");
		}
		else {
			System.out.println(" yes it is correct ");
		}
	}
	
}
