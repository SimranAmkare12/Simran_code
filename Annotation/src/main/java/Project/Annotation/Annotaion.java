package Project.Annotation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Annotaion_info")
public class Annotaion {

	@Id
     private int id ;
     private String city ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Annotaion(int id, String city) {
		super();
		this.id = id;
		this.city = city;
	}
	public Annotaion() {
		super();
	}
	@Override
	public String toString() {
		return "Annotaion [id=" + id + ", city=" + city + ", getId()=" + getId() + ", getCity()=" + getCity()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
     
        

	
}
