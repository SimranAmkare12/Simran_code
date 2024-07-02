package june_10;   // EXAMPLE OF HAS A RELATIONSHIP

public class Demo {

	 public static void main(String args[]) {
		 
		Student s = new Student();
		
		Address ad= new Address();
		
		ad.setCity("Bhopal");
		ad.setDistric(null);
		ad.setPincode("4352");
		ad.setState(" mp ");
		
		s.setS_add(ad);
		
		s.setName(" simran amkare ");
		s.setRolno(1234);
		
		System.out.println("NAME : "+s.getName());
		System.out.println("ROLL NUMBER : "+s.getRolno());
		System.out.println("CITY : "+s.getS_add().getCity());
		System.out.println("STATE : "+s.getS_add().getState());
		System.out.println("DISTRICT :  "+s.getS_add().getDistric());
		System.out.println("PINCODE :  "+s.getS_add().getPincode());
		
		System.out.println(" ");
		System.out.println(" By using parameterized constructor.....");
		
		Student s1 = new Student( " Amkare  simran",1234,new Address(" Indore"," MP"," ","4576"));
		System.out.println(s1);
		 
	 }
}
