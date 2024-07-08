package hasARealtion_array;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student[] arr = new Student [5];
		
		Adderss ad = new Adderss();
		ad.setCity("ahmedabad");
		ad.setPincode(123);
		ad.getState();
		
	
		Student s1 = new Student() ;
		s1.setId(12);
		s1.setName(" simran ");
		s1.setS_add(ad);
		
		arr[0] = s1;
		
		
		
		
		Student s2 = new Student(" Harshita ",12,new Adderss("Bhoap","mp",987));
		arr[1] = s2 ;
		
		Student s3 = new Student(" Reena",34 , new Adderss("patna","Bihar",756));
		arr[2] = s3 ;
		
		Student s4 = new Student("Sakshi ",54, new Adderss("jaipur","rajasthan",546));
		arr[3] = s4 ;
		
		//changing
		Adderss chag =  s4.getS_add();
		chag.setState("panchmadi");
		s4.setS_add(chag);
		
		
		
		Student s5 = new Student("Manshi",42, new Adderss(" jabalpur","mp",654));
		arr[4] = s5 ;
		
		
//		for(Student obj : arr) {
//			System.out.println(obj);
//		}
		
		for(int  i  = 0 ; i<5 ; i++) {
			System.out.println( arr[i] );
		}
		
		
		
		
				 
   /*		
		 
		 Adderss ad = new Adderss();
		 ad.setCity(" Bhopal");
		 ad.setState(" mp ");
		 ad.setPincode(1234);
		 

		 Student s = new Student();
		s.setS_add(ad);
		s.setName("simran");
		s.setId(203);
		
		
		System.out.println("name- "+s.getName());
		System.out.println("id- "+s.getId());
		System.out.println("city-"+s.getS_add().getCity());
		System.out.println("pincode- "+s.getS_add().getPincode());
		System.out.println("state- "+s.getS_add().getState());
		
		///////////////////////////////////////////////////////////////
		
		Student s= new Student();
		//Address class  object 
		Address a = new Address();
		a.setCity("bhopal");
		a.setPincode(46788);
		a.setState("mp");
		
		
		
		//array of 5 students 
	
		Student s2[] = new Student[5];
		
		s2[4]= new Student(123,a,"harshita");
		System.out.println(s2[4].getId());
		System.out.println(s2[4].getName());
		System.out.println(s2[4].getAddress().toString());
		
		
	*/	
		
	/*	
		Student s = new Student ();
		
		Adderss a = new Adderss();
		
		a.setCity("bhopal");
		a.setPincode(46788);
		a.setState("mp");
		
		Student s2[] = new Student[5];
		
		s2[4] = new Student( "simran",123,a);
		System.out.println(s2[4].getId());
		System.out.println(s2[4].getName());
		System.out.println(s2[4].getS_add().toString());
		
		
		*/
		
	}

}
