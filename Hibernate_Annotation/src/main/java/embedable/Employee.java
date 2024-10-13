package embedable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int id ;
	@Column(name= "emp_name")
	private String name ;
	@Column(name= "emp_dept")
	private String department;
	@Column(name= "emp_gender")
	private String gender;
	private Address address ;
	
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee(int id, String name, String department, String gender, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.gender = gender;
		this.address = address;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", gender=" + gender
				+ ", address=" + address + ", getId()=" + getId() + ", getName()=" + getName() + ", getDepartment()="
				+ getDepartment() + ", getGender()=" + getGender() + ", getAddress()=" + getAddress() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
