package has_a_relationship;

public class Animal2 {

	 public static void main(String args[]) {
		 Animal a1= new Animal();
		 a1.setName("cow");
		 a1.setAnimal_type("domestic");
		 a1.setEat(0);
		 
		System.out.println(" Animal name is "+a1.getAnimal_type());
		System.out.println(" Animal type is "+a1.getName()); 
		System.out.println( " Animal eat "+a1.getEat()); 

		 System.out.println("");
		 System.out.println("information of new animal,,.....");
		 
		Animal a2= new Animal();
		 a2.setName("dog");
		 a2.setAnimal_type("domestic");
		 a2.setEat(1);
		 
		 System.out.println(" Animal name is "+a2.getAnimal_type());
			System.out.println(" Animal type is "+a2.getName()); 
			System.out.println( " Animal eat "+a2.getEat()); 

			System.out.println("");
			 System.out.println("information of new animal,,.....");
			
			Animal a3= new Animal();
			 a3.setName("cat");
			 a3.setAnimal_type("domestic");
			 a3.setEat(2);
			 
			 System.out.println(" Animal name is "+a3.getAnimal_type());
				System.out.println(" Animal type is "+a3.getName()); 
				System.out.println( " Animal eat "+a3.getEat()); 

				System.out.println("");
				 System.out.println("information of new animal,,.....");
				
				Animal a4= new Animal();
				 a4.setName("lion");
				 a4.setAnimal_type("wild animal");
				 a4.setEat(1);
				 
				 System.out.println(" Animal name is "+a4.getAnimal_type());
					System.out.println(" Animal type is "+a4.getName()); 
					System.out.println( " Animal eat "+a4.getEat()); 

					System.out.println("");
					 System.out.println("information of new animal,,.....");
					 
					Animal a5= new Animal();
					 a5.setName("lion");
					 a5.setAnimal_type("wild animal");
					 a5.setEat(1);
					 
					 System.out.println(" Animal name is "+a5.getAnimal_type());
						System.out.println(" Animal type is "+a5.getName()); 
						System.out.println( " Animal eat "+a5.getEat());
						
						//has a relationship
						Address add1 = new Address();
						add1.setCity("indore");
						System.out.println(add1.getCity());
	 }
}
