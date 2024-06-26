package has_a_relationship;

public class Animal {
	private int eat;
	private String name;
	private String animal_type;
	private Address s_city;
	

	
	public int getEat() {
		return eat;
	}
	public void setEat(int eat) {
		this.eat = eat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAnimal_type() {
		return animal_type;
	}
	public void setAnimal_type(String animal_type) {
		this.animal_type = animal_type;
	}
	
	//parameter constructor
	public Animal(int eat, String name, String animal_type) {
		super();
		this.eat = eat;
		this.name = name;
		this.animal_type = animal_type;
	}
	 

	//default constructor
	public Animal() {
		
	}
	@Override
	public String toString() {
		return "Animal [eat=" + eat + ", name=" + name + ", animal_type=" + animal_type + ", getEat()=" + getEat()
				+ ", getName()=" + getName() + ", getAnimal_type()=" + getAnimal_type() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
	
