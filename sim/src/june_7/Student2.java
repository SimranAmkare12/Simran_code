package june_7;    // // Address , student , student2 ----> has a relation


public class Student2 {

	public static void main(String[] args) {

		Student s = new Student();
		
		Address ad = new Address();
		
		ad.setCity("Bhopal");
		ad.setPincode("1213");
		ad.setState("mp");
		
		s.setS_add(ad);  // passing object 
		
		s.setName("harshi");
		s.setRollno(456); 
	
		System.out.println(s.getName());
		System.out.println(s.getRollno());
		
		System.out.println(s.getS_add().getCity());
		System.out.println(s.getS_add().getPincode());
		System.out.println(s.getS_add().getState());

		System.out.println();System.out.println("new line------> ");
		
         Student s1 = new Student();
		
		Address ad1 = new Address();
		
		ad1.setCity("patna");
		ad1.setPincode("1913");
		ad1.setState("Bihar");
		
		s1.setS_add(ad1);  // passing object 
		
		s1.setName("Reena");
		s1.setRollno(4926); 
	
		System.out.println(s1.getName());
		System.out.println(s1.getRollno());
		
		System.out.println(s1.getS_add().getCity());
		System.out.println(s1.getS_add().getPincode());
		System.out.println(s1.getS_add().getState());
		
	}

}
