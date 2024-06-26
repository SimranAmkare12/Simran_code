package june_10;    // EXAMPLE OF HAS A RELATIONSHIP

public class Address {
 
	 private String city;
	 private String state;
	 private String distric;
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
	public String getDistric() {
		return distric;
	}
	public void setDistric(String distric) {
		this.distric = distric;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	//parameter
	public Address(String city, String state, String distric, String pincode) {
		super();
		this.city = city;
		this.state = state;
		this.distric = distric;
		this.pincode = pincode;
	}
	
	//default
	public Address() {
		
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", distric=" + distric + ", pincode=" + pincode
				+ ", getCity()=" + getCity() + ", getState()=" + getState() + ", getDistric()=" + getDistric()
				+ ", getPincode()=" + getPincode() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	 
	 

	
	
}
