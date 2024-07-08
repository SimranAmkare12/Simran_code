package hasARealtion_array;

public class Adderss {

	 private String city ;
	 private String state ;
	 private int  pincode ;
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
	
	Adderss(){
		
	}
	
	
	Adderss(String city, String state, int pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Adderss [city=" + city + ", state=" + state + ", pincode=" + pincode + ", getCity()=" + getCity()
				+ ", getState()=" + getState() + ", getPincode()=" + getPincode() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	 
	
	
}
