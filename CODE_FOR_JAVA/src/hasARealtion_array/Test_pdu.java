package hasARealtion_array;

public class Test_pdu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		University[] arr = new University[5];
		
		Professor p = new Professor();
		p.setPf_id(12);
		p.setPf_name("simran");
		p.setPf_department(" IT ");
		
		
		Department d = new Department();
		d.setD_id(99);
		d.setD_name("it....");
		d.setPf_info(p);
		
		
		University u1 = new University();
		u1.setD_info(d);
		
		arr[0] = u1 ;
		
		
		University u2 = new University(new Department(12,"SALES ",new Professor(12," harshi" ," p_sales..")));
		arr[1] = u2 ;
		
		University u3 = new University(new Department(123,"MARKETING ",new Professor(123," reena." ," p_marketing..")));
		arr[2] = u3 ;
		
		University u4 = new University(new Department(1234,"NETWORKING... ",new Professor(123," sakshi." ," p_networking.")));
		arr[3] = u4 ;
		
		University u5 = new University(new Department(123,"GUIDUING  ",new Professor(123," manshi." ," p_guiding..")));
		arr[4] = u5 ;
		
		
		/*
		 //changing
		Adderss chag =  s4.getS_add();
		chag.setState("panchmadi");
		s4.setS_add(chag);
		 
		 */
		
		u4.getD_info().getPf_info().setPf_name(" POONAM ");
		u4.getD_info().getPf_info().setPf_id(0000);
		
		
		for(University obj :arr) {
			System.out.println(obj);
			
		}
		
		
	}

}
