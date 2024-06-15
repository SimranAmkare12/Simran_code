package june_10;   // EXAMPLE OF HAS A RELATIONSHIP

public class Student {

	  private String name;
	  private int rolno;
	  private Address s_add;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRolno() {
		return rolno;
	}
	public void setRolno(int rolno) {
		this.rolno = rolno;
	}
	public Address getS_add() {
		return s_add;
	}
	public void setS_add(Address s_add) {
		this.s_add = s_add;
	}
	public Student(String name, int rolno, Address s_add) {
		super();
		this.name = name;
		this.rolno = rolno;
		this.s_add = s_add;
	}
	
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rolno=" + rolno + ", s_add=" + s_add + ", getName()=" + getName()
				+ ", getRolno()=" + getRolno() + ", getS_add()=" + getS_add() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	  
	
}
