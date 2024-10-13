package Project.Hibernate;

public class Student {
	
	private int id ;
	private String name;
	private int rollno ;
	private String city ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Student(int id, String name, int rollno, String city) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.city = city;
	}
	
	public Student() {
		super();
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollno=" + rollno + ", city=" + city + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getRollno()=" + getRollno() + ", getCity()=" + getCity()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
