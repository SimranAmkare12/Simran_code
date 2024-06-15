package june11;

public class Refrigerator {

	private String colour;
	private int no_of_door;
	
	public void freeze() {
		System.out.println("keep the items cool and fresh ");
		
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getNo_of_door() {
		return no_of_door;
	}

	public void setNo_of_door(int no_of_door) {
		this.no_of_door = no_of_door;
	}

	public Refrigerator(String colour, int no_of_door) {
		super();
		this.colour = colour;
		this.no_of_door = no_of_door;
	}
	
	public Refrigerator() {
		
	}

	@Override
	public String toString() {
		return "Refrigerator [colour=" + colour + ", no_of_door=" + no_of_door + ", getColour()=" + getColour()
				+ ", getNo_of_door()=" + getNo_of_door() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
