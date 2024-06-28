package inheritance_example2;

public class Appliances {

	private String brandname;
	private int price;
	public void mainFunction() {
		System.out.println(" making life esay");
	}
	
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Appliances(String brandname, int price) {
		super();
		this.brandname = brandname;
		this.price = price;
	}
	
	public Appliances() {
		
	}
	@Override
	public String toString() {
		return "Appliances [brandname=" + brandname + ", price=" + price + ", getBrandname()=" + getBrandname()
				+ ", getPrice()=" + getPrice() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
