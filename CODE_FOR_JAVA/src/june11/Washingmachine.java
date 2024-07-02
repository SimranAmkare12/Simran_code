package june11;

public class Washingmachine  extends Appliances {
	
	private String type;
	 private int space;
	 
	 public void work() {
		 System.out.println(" washing cloths....");
	 }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSpace() {
		return space;
	}

	public void setSpace(int space) {
		this.space = space;
	}

	public Washingmachine(String brandname, int price, String type, int space) {
		super(brandname, price);
		this.type = type;
		this.space = space;
	}
	 
	public Washingmachine() {
		
	}

	@Override
	public String toString() {
		return "Washingmachine [type=" + type + ", space=" + space + ", getType()=" + getType() + ", getSpace()="
				+ getSpace() + ", getBrandname()=" + getBrandname() + ", getPrice()=" + getPrice() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
