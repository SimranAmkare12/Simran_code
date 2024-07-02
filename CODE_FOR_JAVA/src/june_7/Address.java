package june_7;         // Address , student , student2 ----> has a relation

public class Address {

	 private String city;
	 private String state;
	 private String pincode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	// parameterised constructor
	public Address(String city, String state, String pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
   
	  // default constructor
     Address(){
	 
         }
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + ", getCity()=" + getCity()
			+ ", getState()=" + getState() + ", getPincode()=" + getPincode() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
	 
	 
	//
	
}
