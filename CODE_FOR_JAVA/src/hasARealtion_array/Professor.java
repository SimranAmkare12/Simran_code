package hasARealtion_array;
/*
 you need to create a professor class that has attribute proffessor id,proffessor name,proffessor department . 
 Now you create a Department class  that has Proffessor Depatment id, deparment name .
 Now create  a University class that has Department attribute.
 Create  array of 5 University object that should be distinct and change the name of proffessor name and
  proffessor id  of last University object without changing object .
 */

public class Professor {
	
	private int pf_id ;
	private String pf_name ;
	private String pf_department ;
	
	 Professor(){
		 
	 }

	public int getPf_id() {
		return pf_id;
	}

	public void setPf_id(int pf_id) {
		this.pf_id = pf_id;
	}

	public String getPf_name() {
		return pf_name;
	}

	public void setPf_name(String pf_name) {
		this.pf_name = pf_name;
	}

	public String getPf_department() {
		return pf_department;
	}

	public void setPf_department(String pf_department) {
		this.pf_department = pf_department;
	}

	Professor(int pf_id, String pf_name, String pf_department) {
		super();
		this.pf_id = pf_id;
		this.pf_name = pf_name;
		this.pf_department = pf_department;
	}

	@Override
	public String toString() {
		return "Professor [pf_id=" + pf_id + ", pf_name=" + pf_name + ", pf_department=" + pf_department
				+ ", getPf_id()=" + getPf_id() + ", getPf_name()=" + getPf_name() + ", getPf_department()="
				+ getPf_department() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	

}
