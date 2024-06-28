package inheritance_example2;

public class Television extends Appliances {
	
	 private int size ;
	 private String loundness;
	
	 
	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public String getLoundness() {
		return loundness;
	}
	


	public Television(String brandname, int price, int size, String loundness) {
		super(brandname, price);  //
		this.size = size;
		this.loundness = loundness;
	}
	public Television() {
		
	}
	

	public void setLoundness(String loundness) {
		this.loundness = loundness;
	}

	

	@Override
	public String toString() {
		return "Television [size=" + size + ", loundness=" + loundness + ", getSize()=" + getSize()
				+ ", getLoundness()=" + getLoundness() + ", getBrandname()=" + getBrandname() + ", getPrice()="
				+ getPrice() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}


	public void changechannel() {
		System.out.println(" channel has been change");
	}
	

}
