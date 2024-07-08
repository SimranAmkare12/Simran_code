package hasARealtion_array;

public class Student {

	
	private String name;
	private int id ;
	private Adderss s_add ;
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Adderss getS_add() {
		return s_add;
	}


	public void setS_add(Adderss s_add) {
		this.s_add = s_add;
	}


	Student(){
		
	}
	
	
	Student(String name, int id, Adderss s_add) {
		super();
		this.name = name;
		this.id = id;
		this.s_add = s_add;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", s_add=" + s_add + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	public static void main(String[] args) {
		
		
		
	}
	
	
	 
}
