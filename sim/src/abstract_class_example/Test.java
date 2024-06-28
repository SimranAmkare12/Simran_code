package abstract_class_example;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Creditcardgateway c = new  Creditcardgateway();
		 c.processpayment();
		 
		 paypalgateway p = new  paypalgateway();
		 p.processpayment();
		
	}

}
