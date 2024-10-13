package embedable;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	
	private String city ;
	private String h_no ;
	private int pincode ;
	private String street ;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getH_no() {
		return h_no;
	}
	public void setH_no(String h_no) {
		this.h_no = h_no;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Address() {
		super();
	}
	public Address(String city, String h_no, int pincode, String street) {
		super();
		this.city = city;
		this.h_no = h_no;
		this.pincode = pincode;
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", h_no=" + h_no + ", pincode=" + pincode + ", street=" + street + "]";
	}
	
	
	
}
