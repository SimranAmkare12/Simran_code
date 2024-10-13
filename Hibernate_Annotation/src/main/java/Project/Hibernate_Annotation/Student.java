package Project.Hibernate_Annotation;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Student2")
public class Student {

@Id
	private int id ;
@Column(name =" st_name")
	private String name;

	private int rollno ;
//	@Transient//optional
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
