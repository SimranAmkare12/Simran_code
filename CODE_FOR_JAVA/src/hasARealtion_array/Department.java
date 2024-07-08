package hasARealtion_array;

public class Department {
	
	private int d_id ;
	private String d_name ;
	 Professor pf_info ;
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public Professor getPf_info() {
		return pf_info;
	}
	public void setPf_info(Professor pf_info) {
		this.pf_info = pf_info;
	}
	Department(){
		
	}
	
	Department(int d_id, String d_name, Professor pf_info) {
		super();
		this.d_id = d_id;
		this.d_name = d_name;
		this.pf_info = pf_info;
	}
	@Override
	public String toString() {
		return "Department [d_id=" + d_id + ", d_name=" + d_name + ", pf_info=" + pf_info + ", getD_id()=" + getD_id()
				+ ", getD_name()=" + getD_name() + ", getPf_info()=" + getPf_info() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	 
	
	 

}
