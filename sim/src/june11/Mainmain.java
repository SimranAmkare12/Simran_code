package june11;  // showing is a relationship

public class Mainmain {

	 public static void main(String args[] ){
		 Appliances a = new  Appliances();
		 a.setBrandname("Bajaj");
		 a.setPrice(12000);
		 
		 System.out.println();
		 System.out.println("information about  television");
		// System.out.println(a.getBrandname());
		 //System.out.println(a.getPrice());
		 
		 Television t= new Television();  // default constructor
		 t.setBrandname("LG");
		 t.setLoundness(" lodnes_t");
		 t.setPrice(54645);
		 t.setSize(52);
		 
		 System.out.println(" brand of tv "+t.getBrandname());
		 System.out.println(" loudness of tv" +t.getLoundness());
		 System.out.println(" price of tv"+t.getPrice());
		 System.out.println(" size of tv"+t.getSize());
		 
		 t.mainFunction();
		 
		 t.changechannel();
		 
		 //Television t1= new Television(32, "44tb");
		 
		 Television t2= new Television("usha",1300,12," loudness");
		 
		 
		 Washingmachine w1= new  Washingmachine();
		 w1.setBrandname(" whirpool");
		 w1.setSpace(8);
		 w1.setPrice(16000);
		 w1.setType(" manual machine");
		 
		 System.out.println();
		 System.out.println("  ALL INFORMATION ABOU WASHING MACHINE....");
		 w1.work();
		 System.out.println("NEME OF WASHING MACHINE "+w1.getBrandname());
		 System.out.println(" PRICE OF WASHING MACHINE"+w1.getPrice());
		 System.out.println(" SPACE REQUIRED BY TELEVISION "+w1.getSpace());
		 System.out.println(" TYPE OF WASHINGMACHINE"+w1.getType());
		 
		 System.out.println();
		 System.out.println(" information about refrigerator");
		 Refrigerator r = new  Refrigerator();
		 r.setColour("black ");
		 r.setNo_of_door(2);
		 r.freeze();
		 System.out.println(" color of refrigerator "+r.getColour());
		 System.out.println(" no. of doors in refregerator"+r.getNo_of_door());
	 }
}
