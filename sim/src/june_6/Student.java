package june_6;
                  // for showing example of java bean
public class Student {
	// vehicle class
	 private String number ;
	 private String name ;
	 private String model;
	 
	 
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	public Student(String number, String name, String model) {
		super();
		this.number = number;
		this.name = name;
		this.model = model;
	}
	
	public Student() {
		
		System.out.println(" default constructor");
	}
	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", model=" + model + ", getNumber()=" + getNumber()
				+ ", getName()=" + getName() + ", getModel()=" + getModel() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

	}

