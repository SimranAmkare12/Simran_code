package hasARealtion_array;

public class University {

	 Department d_info ;

	public Department getD_info() {
		return d_info;
	}

	public void setD_info(Department d_info) {
		this.d_info = d_info;
	}
	
	University(){
		
	}

	University(Department d_info) {
		super();
		this.d_info = d_info;
	}

	@Override
	public String toString() {
		return "University [d_info=" + d_info + ", getD_info()=" + getD_info() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	 
	
}
