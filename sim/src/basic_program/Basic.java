package basic_program;

public class Basic {

	public static void main( String args[]) {
		Car scorpio = new Car();
		scorpio.brand  = "mahindra";
		scorpio.tyre = 4 ;
		scorpio.modelname = "s11"; 
		
		/*
		scorpio1.brand  = "mahindra";
		scorpio1.tyre = 4 ;
		scorpio1.modelname = "s11";
		*/
		
		System.out.println(scorpio.giveHorn());
		System.out.println(scorpio.speed());
		
		System.out.println("scorpio object li puri jankari "+"brand----->"+scorpio.brand+" model "+scorpio.modelname);
		
	}
}
