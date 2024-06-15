package Bank_override;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Bank b= new Bank();
  System.out.println(" rate of bank class "+b.rate());
  
  SBI sb= new SBI();
  System.out.println(" rate of SBI class "+sb.rate());
  
  Axis a = new Axis();
  System.out.println(" rate of Axis class"+a.rate());
	}
	
		

}
